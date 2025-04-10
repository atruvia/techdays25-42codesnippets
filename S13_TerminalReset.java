// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0021_TerminalReset.java on 2025-04-10T19:24:02.231326Z
import java.io.IOException;

interface S13_TerminalReset {

  static void main(String... args) throws IOException {
    System.out.println("duke is not nice");
    System.out.print("\033c");
  }
}