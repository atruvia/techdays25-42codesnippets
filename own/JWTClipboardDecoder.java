import java.awt.*;
import java.awt.datatransfer.*;
import java.util.Base64;
import java.util.Timer;
import java.util.TimerTask;

public class JWTClipboardDecoder {

    public static void main(String[] args) throws Exception {
        String clipboardContent = getClipboardContents();
        decodeJwt(clipboardContent);
    }

    private static String getClipboardContents() throws Exception {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable content = clipboard.getContents(null);
        if (content != null && content.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return (String) content.getTransferData(DataFlavor.stringFlavor);
        }
        return null;
    }

    private static void decodeJwt(String token) {
        String[] parts = token.split("\\.");
        System.out.println("Header:");
        System.out.println(new String(Base64.getUrlDecoder().decode(parts[0])));
        System.out.println("Payload:");
        System.out.println(new String(Base64.getUrlDecoder().decode(parts[1])));
    }
}

// eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IjQyIEphdmEgU2Nobmlwc2VsIiwiY29uZmVyZW5jZSI6IkF0cnV2aWEgVGVjaCBEYXlzIDIwMjUiLCJpYXQiOjE1MTYyMzkwMjJ9.lcCfqAGv8W8oaDsg6TwMUotjSR96nT5C_qj2bsIPRak
