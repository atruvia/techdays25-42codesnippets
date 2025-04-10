// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0015_BuiltInLogger.java on 2025-04-10T19:24:02.284147Z
import java.lang.System.Logger.Level;

public class S16_BuiltInLogger {
    public static void main(String[] args) {
        var log = System.getLogger("duke");
        log.log(Level.INFO, "hello, world");
        System.out.println("adf");
    }
}