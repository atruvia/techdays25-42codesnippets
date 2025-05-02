// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0027_ObjectsPreconditions.java on 2025-05-02T13:37:27.315223Z
import java.time.LocalDateTime;
import java.util.Objects;

public class S22_ObjectsPreconditions {

    static String error() {
        return "input please now: " + LocalDateTime.now();
    }

    static void parameterPlease(String input) {
        Objects.requireNonNull(input, S22_ObjectsPreconditions::error);
    }

    public static void main(String[] args) {
        parameterPlease(null);
    }
}