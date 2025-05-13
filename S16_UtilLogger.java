// Copied from file:/Users/xcg6892/git/_atruvia-other/techdays25-42codesnippets/own/UtilLogger.java on 2025-05-13T18:04:32.823476Z

import java.io.IOException;
import java.lang.System.Logger.Level;
import java.nio.file.Files;
import java.nio.file.Path;

public class S16_UtilLogger {
    public static void main(String[] args) throws IOException {

        // Inspired by
        // https://github.com/AdamBien/best-of-java-shorts/blob/main/S0015_BuiltInLogger.java
        // https://github.com/AdamBien/best-of-java-shorts/blob/main/S0078_SystemLoggerConfiguration.java

        var log = System.getLogger("duke");

        log.log(Level.INFO, "----------------");
        log.log(Level.INFO, "hello tech days!");
        log.log(Level.INFO, "hello {0}", "Duke");
        log.log(Level.INFO, "----------------");

        System.in.read();

        var javaHome = System.getProperty("java.home");
        var path = Path.of(javaHome, "conf", "logging.properties");
        var config = Files.readString(path);
        log.log(Level.INFO, config);
    }
}