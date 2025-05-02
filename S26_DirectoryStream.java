// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0032_DirectoryStream.java on 2025-05-02T13:37:27.380413Z
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class S26_DirectoryStream {

    static void createDirectories() throws IOException {
        for (int i = 0; i < 10; i++) {
            Files.createDirectories(Path.of("./directory_" + i));
        }

    }

    public static void main(String[] args) throws IOException {
        createDirectories();
        var root = Path.of(".");
        Files.newDirectoryStream(root)
                .forEach(System.out::println);
    }

}