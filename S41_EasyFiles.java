// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0100_EasyFiles.java on 2025-05-02T19:28:37.111286Z
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

interface App {

  static void main(String... args) throws IOException {
    var in = Path.of("./S41_EasyFiles.java");
    var out = Path.of("./_S41_EasyFiles_CopyTarget.java");
    var content = Files.readString(in).toUpperCase();
    Files.writeString(out,content);
  }
}