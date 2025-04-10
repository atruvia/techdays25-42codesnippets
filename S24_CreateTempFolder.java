// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0030_CreateTempFolder.java on 2025-04-10T19:24:02.425292Z
import java.io.IOException;
import java.nio.file.Files;

public class S24_CreateTempFolder {

    public static void main(String[] args) throws IOException {
        var temp = Files.createTempDirectory("airhacks");
        System.out.println(temp);
    }
}