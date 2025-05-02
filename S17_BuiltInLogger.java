// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0015_BuiltInLogger.java on 2025-05-02T13:37:27.218563Z
import java.lang.System.Logger.Level;

public class S17_BuiltInLogger {
    public static void main(String[] args) {
        var log = System.getLogger("duke");
        log.log(Level.INFO, "hello, world");
        System.out.println("adf");
    }
}