// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0040_SoutRedirect.java on 2025-04-10T19:24:02.515148Z
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * App
 */
public class S29_SoutRedirect {

    public static void main(String[] args) throws FileNotFoundException {
        var s = new PrintStream("log.file");
        System.setOut(s);
        System.out.println("hello,duke");
    }
}