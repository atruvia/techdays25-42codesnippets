// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0020_Assert.java on 2025-05-02T12:04:19.966406Z
import java.util.Objects;

//-ea
public class S17_Assert {

    static void parameterNeeded(String input) {
        assert input != null;
    }

    public static void main(String[] args) {
        parameterNeeded(null);
    }

}