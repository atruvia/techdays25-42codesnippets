// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0021_TerminalReset.java on 2025-05-02T19:28:31.941676Z
import java.io.IOException;

interface S13_TerminalReset {

  static void main(String... args) throws IOException {
    System.out.println("duke is not nice");
    System.out.print("\033c");
  }
}