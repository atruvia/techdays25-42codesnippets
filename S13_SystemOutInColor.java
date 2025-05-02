// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0014_SystemOutInColor.java on 2025-05-02T13:37:27.149730Z

/**
 * https://en.wikipedia.org/wiki/ANSI_escape_code
 */
interface S13_SystemOutInColor {

    static void main(String... args) {
        System.out.println("\033[0;31mhello, duke");
        System.out.println("\033[0;32mhello, duke");
        System.out.println("\033[0;33mhello, duke");
    }

}