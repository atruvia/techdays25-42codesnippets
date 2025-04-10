// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0035_LinesString.java on 2025-04-10T19:24:02.461668Z
public class S26_LinesString {

    public static void main(String[] args) {
        var result = """
                duke is nice
                java rocks
                james likes duke
                """
                .lines()
                .filter(l -> l.contains("java"))
                .findAny()
                .orElse("not found");

        System.out.println(result);
    }
}
