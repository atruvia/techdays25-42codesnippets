// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0051_Frequency.java on 2025-05-14T07:01:22.239687Z
import java.util.Collections;
import java.util.List;

interface S32_Frequency {

  static void main(String... args) {
    var numbers = List.of(1,2,2,2,3,3,3);
    var freq = Collections.frequency(numbers, 2);
    System.out.println(freq);
  }
}