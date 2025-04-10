// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0100_EasyFiles.java on 2025-04-10T19:24:02.741378Z
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

interface App {

  static void main(String... args) throws IOException {
    var in = Path.of("./S42_EasyFiles.java");
    var out = Path.of("./_S42_EasyFiles_CopyTarget.java");
    var content = Files.readString(in).toUpperCase();
    Files.writeString(out,content);
  }
}