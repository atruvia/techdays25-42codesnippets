// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0035_LinesString.java on 2025-05-14T07:01:21.308559Z
public class S27_LinesString {

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
