// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0011_ReadPassword.java on 2025-04-10T19:24:02.186442Z
public class S10_ReadPassword {

    public static void main(String[] args) {
        var console = System.console();
        var chars = console.readPassword("pwd>");
        System.out.println(chars);
    }

}