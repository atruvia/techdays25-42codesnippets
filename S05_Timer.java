// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0004_Timer.java on 2025-05-02T19:28:30.736096Z
import java.util.Timer;
import java.util.TimerTask;

public class S05_Timer {
    public static void main(String[] args) {
        var task = new TimerTask() {

            @Override
            public void run() {
                System.out.println("working");
            }
        };
        var timer = new Timer();
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}