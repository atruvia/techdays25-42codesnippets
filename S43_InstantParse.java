// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0141_InstantParse.java on 2025-05-02T19:28:37.506506Z
import java.time.Instant;

interface App {

  static void main(String... args) {
    var instant = Instant.parse("2024-12-12T10:00:00Z");
    System.out.println(instant);
  }
}