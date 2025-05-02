// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0040_SoutRedirect.java on 2025-05-02T13:37:27.604542Z
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * App
 */
public class S30_SoutRedirect {

    public static void main(String[] args) throws FileNotFoundException {
        var s = new PrintStream("log.file");
        System.setOut(s);
        System.out.println("hello,duke");
    }
}