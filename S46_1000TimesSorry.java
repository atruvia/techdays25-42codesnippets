// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0119_1000TimesSorry.java on 2025-05-02T19:28:38.156772Z
import java.util.stream.Stream;




interface Sorry {
  static void main(String... args) {
    Stream.generate(()->"Sorry babu")
    .limit(1001)
    .forEach(System.out::println);
  }
}