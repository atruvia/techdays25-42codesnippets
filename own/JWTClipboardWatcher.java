import java.awt.Dialog;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Base64;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class JWTClipboardWatcher {

    private static final Pattern JWT_PATTERN = Pattern.compile("^[A-Za-z0-9_-]+\\.[A-Za-z0-9_-]+\\.[A-Za-z0-9_-]+$");
    private static String lastClipboard = "";

    public static void main(String[] args) {
        Frame frame = new Frame();
        final Dialog dialog = new Dialog(frame, "JWT Decoder", false);
        TextArea textArea = new TextArea("", 20, 60, TextArea.SCROLLBARS_VERTICAL_ONLY);
        dialog.add(textArea);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);

        Executors.newScheduledThreadPool(1)
                .scheduleAtFixedRate(() -> {
                    String clipText = getClipboardText();
                    if (clipText == null || clipText.equals(lastClipboard))
                        return;

                    lastClipboard = clipText; // Update immer, auch wenn kein JWT

                    String trimmed = clipText.trim();
                    if (JWT_PATTERN.matcher(trimmed).matches()) {
                        String[] parts = trimmed.split("\\.");
                        if (parts.length == 3) {
                            String header = decodeBase64(parts[0]);
                            String payload = decodeBase64(parts[1]);

                            StringBuilder sb = new StringBuilder();
                            sb.append("== Header ==\n").append(prettyJson(header)).append("\n");
                            sb.append("== Payload ==\n").append(prettyJson(payload)).append("\n");

                            EventQueue.invokeLater(() -> textArea.setText(sb.toString()));
                        }
                    } else {
                        EventQueue.invokeLater(() -> textArea.setText(""));
                    }
                }, 0, 1, TimeUnit.SECONDS);

        // Fenster offen halten
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }

    static String getClipboardText() {
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            Transferable t = clipboard.getContents(null);
            if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String) t.getTransferData(DataFlavor.stringFlavor);
            }
        } catch (Exception e) {
            // Ignorieren
        }
        return null;
    }

    static String decodeBase64(String base64url) {
        try {
            byte[] decodedBytes = Base64.getUrlDecoder().decode(base64url);
            return new String(decodedBytes);
        } catch (IllegalArgumentException e) {
            return "[Ungültiges Base64]";
        }
    }

    private static String prettyJson(String json) {
        StringBuilder pretty = new StringBuilder();
        int indent = 0;
        boolean inQuotes = false;

        char[] charArray = json.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            switch (c) {
                case '"':
                    pretty.append(c);
                    if (i == 0 || charArray[i - 1] != '\\') {
                        inQuotes = !inQuotes;
                    }
                    break;
                case '{':
                case '[':
                    pretty.append(c);
                    if (!inQuotes) {
                        pretty.append('\n');
                        indent++;
                        pretty.append("  ".repeat(indent));
                    }
                    break;
                case '}':
                case ']':
                    if (!inQuotes) {
                        pretty.append('\n');
                        indent--;
                        pretty.append("  ".repeat(indent));
                    }
                    pretty.append(c);
                    break;
                case ',':
                    pretty.append(c);
                    if (!inQuotes) {
                        pretty.append('\n');
                        pretty.append("  ".repeat(indent));
                    }
                    break;
                case ':':
                    pretty.append(c);
                    if (!inQuotes)
                        pretty.append(' ');
                    break;
                default:
                    pretty.append(c);
            }
        }

        return pretty.toString();
    }
}
