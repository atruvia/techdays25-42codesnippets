// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0005_ScheduledThreadPool.java on 2025-04-10T19:24:02.142345Z
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

interface S07_ScheduledThreadPool {

  static void main(String... args) {
    var scheduler = Executors.newScheduledThreadPool(1);
    scheduler
        .scheduleAtFixedRate(() -> System.out.println("hello"), 0, 1, TimeUnit.SECONDS);
  }
}