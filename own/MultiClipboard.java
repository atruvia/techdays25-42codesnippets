import java.awt.Button;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiClipboard {
    private Label[] labels = new Label[10];

    public void main() {
        new MultiClipboard().show();
    }

    void show() {
        var dialog = new Dialog((Dialog) null, "Multi-Zwischenablage");
        var panel = new Panel(new GridLayout(10, 2));
        for (int i = 0; i < labels.length; i++) {
            final var label = new Label("");
            labels[i] = label;
            panel.add(labels[i]);
            Button button = new Button("Copy");
            button.addActionListener(e -> {
                var text = label.getText();
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(text), null);
            });
            panel.add(button);
        }
        dialog.add(panel);
        dialog.pack();
        dialog.setVisible(true);
        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        var scheduler = Executors.newScheduledThreadPool(1);
        scheduler
                .scheduleAtFixedRate(() -> insertContent(getClipboardContents()), 0, 1, TimeUnit.SECONDS);
    }

    void insertContent(String content) {
        if (content != null && !content.equals(labels[0].getText())) {
            for (int i = labels.length - 1; i > 0; i--) {
                labels[i].setText(labels[i - 1].getText());
            }
            labels[0].setText(content);
        }
    }

    private static String getClipboardContents() {
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            Transferable content = clipboard.getContents(null);
            if (content != null && content.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String) content.getTransferData(DataFlavor.stringFlavor);
            }
        } catch (Exception ex) {
        }
        return null;
    }
}
