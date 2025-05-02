// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0027_ObjectsPreconditions.java on 2025-05-02T19:28:33.377696Z
import java.time.LocalDateTime;
import java.util.Objects;

public class S21_ObjectsPreconditions {

    static String error() {
        return "input please now: " + LocalDateTime.now();
    }

    static void parameterPlease(String input) {
        Objects.requireNonNull(input, S21_ObjectsPreconditions::error);
    }

    public static void main(String[] args) {
        parameterPlease(null);
    }
}