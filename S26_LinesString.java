// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0035_LinesString.java on 2025-05-02T12:04:21.849946Z
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
