// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0037_FileCopy.java on 2025-04-10T19:24:02.478385Z
import java.nio.file.Files;
import static java.nio.file.Path.*;
import java.io.IOException;

interface S27_FileCopy {
  static void main(String... args) throws IOException {
    Files.copy(of("Readme.md"), of("ReadmeAsWell.md"));
  }

}