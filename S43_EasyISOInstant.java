// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0145_EasyISOInstant.java on 2025-04-10T19:24:02.755242Z
import java.time.Instant;

interface App {

  static void main(String... args) {
    var date = Instant
    .now()
    .toString();

    System.out.println(date);
  }
}