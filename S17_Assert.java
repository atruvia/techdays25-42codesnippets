// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0020_Assert.java on 2025-04-10T19:24:02.301774Z

//-ea
public class S17_Assert {

    static void parameterNeeded(String input) {
        assert input != null;
    }

    public static void main(String[] args) {
        parameterNeeded(null);
    }

}