// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0030_CreateTempFolder.java on 2025-05-14T07:01:20.686923Z
import java.io.IOException;
import java.nio.file.Files;

public class S25_CreateTempFolder {

    public static void main(String[] args) throws IOException {
        var temp = Files.createTempDirectory("airhacks");
        System.out.println(temp);
    }
}