// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0039_EndlessStreams.java on 2025-05-02T12:22:42.901108Z
import java.time.LocalDateTime;
import java.util.stream.Stream;

interface S28_EndlessStreams {

  static void main(String... args) {
    var dates = Stream
        .generate(LocalDateTime::now)
        .map(LocalDateTime::toString)
        .limit(100) // remove to experience infinity
        .toList();
    System.out.println(dates);

  }
}
