// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0145_EasyISOInstant.java on 2025-05-02T19:28:37.297925Z
import java.time.Instant;

interface App {

  static void main(String... args) {
    var date = Instant
    .now()
    .toString();

    System.out.println(date);
  }
}