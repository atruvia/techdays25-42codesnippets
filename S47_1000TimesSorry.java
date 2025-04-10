// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0119_1000TimesSorry.java on 2025-04-10T19:24:02.823641Z
import java.util.stream.Stream;




interface Sorry {
  static void main(String... args) {
    Stream.generate(()->"Sorry babu")
    .limit(1001)
    .forEach(System.out::println);
  }
}