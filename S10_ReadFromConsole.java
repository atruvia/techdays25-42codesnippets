// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0010_ReadFromConsole.java on 2025-05-02T13:37:27.103503Z
public class S10_ReadFromConsole {

    public static void main(String[] args) {
        var console = System.console();
        console.printf("> ");
        var input = console.readLine();
        console.printf("echo " + input);
    }
}