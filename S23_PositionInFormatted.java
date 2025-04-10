// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0029_PositionInFormatted.java on 2025-04-10T19:24:02.409913Z
public class S23_PositionInFormatted {

    public static void main(String[] args) {
        var message = """
                hello, %1$s
                question: %2$s
                good bye, %1$s
                """.formatted("duke", "are you developer?");
        System.out.println(message);
    }
}