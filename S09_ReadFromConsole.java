// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0010_ReadFromConsole.java on 2025-04-10T19:24:02.169299Z
public class S09_ReadFromConsole {

    public static void main(String[] args) {
        var console = System.console();
        console.printf("> ");
        var input = console.readLine();
        console.printf("echo " + input);
    }
}