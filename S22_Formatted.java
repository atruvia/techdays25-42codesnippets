// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0028_Formatted.java on 2025-05-02T19:28:33.587199Z
public class S22_Formatted {

    public static void main(String[] args) {
        var message = """
        hey, %s. You are older than %d
        """.formatted("duke",18);
        System.out.println(message);
    }
}