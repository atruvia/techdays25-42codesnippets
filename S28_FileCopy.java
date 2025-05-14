// Copied from file:/Users/xhu1006/git/atruvia/techdays25-42codesnippets/own/FileCopy.java on 2025-05-14T07:01:21.318879Z
// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0037_S28_FileCopy.java on 2025-05-02T12:04:22.061270Z
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

interface S28_FileCopy {
  static void main(String... args) throws IOException {
    Files.copy(Path.of("Readme.md"), Path.of("ReadmeCopy.md"));
  }

}