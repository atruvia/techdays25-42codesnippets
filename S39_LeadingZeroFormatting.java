// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0070_LeadingZeroFormatting.java on 2025-04-10T19:24:02.694514Z
import static java.lang.System.out;
import java.util.stream.IntStream;

interface App {

  static void main(String... args) {
    IntStream.rangeClosed(0, 10)
        .mapToObj("%03d"::formatted)
        .forEach(out::println);
  }
}