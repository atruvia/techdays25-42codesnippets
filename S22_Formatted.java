// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0028_Formatted.java on 2025-04-10T19:24:02.393607Z
public class S22_Formatted {

    public static void main(String[] args) {
        var message = """
        hey, %s. You are older than %d
        """.formatted("duke",18);
        System.out.println(message);
    }
}