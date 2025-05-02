// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0030_CreateTempFolder.java on 2025-05-02T19:28:33.967111Z
import java.io.IOException;
import java.nio.file.Files;

public class S24_CreateTempFolder {

    public static void main(String[] args) throws IOException {
        var temp = Files.createTempDirectory("airhacks");
        System.out.println(temp);
    }
}