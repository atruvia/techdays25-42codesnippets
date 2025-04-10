// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0084_ReadingIntStreams.java on 2025-04-10T19:24:02.726317Z
import java.util.Scanner;

interface App {

  static void main(String... args) {
    try (var s = new Scanner(System.in)) {
      while(s.hasNextInt()){
        System.out.println("> " + s.nextInt());
      }
    } 
  }
}