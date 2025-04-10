// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0004_Timer.java on 2025-04-10T19:24:02.117556Z
import java.util.Timer;
import java.util.TimerTask;

public class S06_Timer {
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