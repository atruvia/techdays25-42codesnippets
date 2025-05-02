// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0041_TimeVsChronoUnit.java on 2025-05-02T19:28:34.961682Z
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

interface S30_TimeVsChronoUnit {

  static void main(String... args) throws InterruptedException {
    System.out.println("what's the difference?");
    var tu = TimeUnit.SECONDS;
    tu.sleep(2);
    var cu = ChronoUnit.SECONDS;
  }
}