// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0010_ReadFromConsole.java on 2025-05-02T19:28:31.304136Z
public class S09_ReadFromConsole {

    public static void main(String[] args) {
        var console = System.console();
        console.printf("> ");
        var input = console.readLine();
        console.printf("echo " + input);
    }
}