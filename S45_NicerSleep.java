// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0100_NicerSleep.java on 2025-04-10T19:24:02.789052Z
import java.time.Duration;

interface App {

  static void main(String... args) 
  throws InterruptedException {
    System.out.println("good night");
    Thread.sleep(Duration.ofSeconds(1));
    System.out.println("good morning");
  }
}