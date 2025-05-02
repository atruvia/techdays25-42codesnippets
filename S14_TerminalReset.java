// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0021_TerminalReset.java on 2025-05-02T13:37:27.164535Z
import java.io.IOException;

interface S14_TerminalReset {

  static void main(String... args) throws IOException {
    System.out.println("duke is not nice");
    System.out.print("\033c");
  }
}