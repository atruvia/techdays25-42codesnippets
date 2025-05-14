// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0039_EndlessStreams.java on 2025-05-14T07:01:21.532512Z
import java.time.LocalDateTime;
import java.util.stream.Stream;

interface S29_EndlessStreams {

  static void main(String... args) {
    var dates = Stream
        .generate(LocalDateTime::now)
        .map(LocalDateTime::toString)
        .limit(100) // remove to experience infinity
        .toList();
    System.out.println(dates);

  }
}
