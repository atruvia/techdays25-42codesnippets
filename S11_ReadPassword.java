// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0011_ReadPassword.java on 2025-05-02T13:37:27.118909Z
public class S11_ReadPassword {

    public static void main(String[] args) {
        var console = System.console();
        var chars = console.readPassword("pwd>");
        System.out.println(chars);
    }

}