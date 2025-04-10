// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0022_CompactNumberFormat.java on 2025-04-10T19:24:02.245053Z
import java.text.NumberFormat;

public class S14_CompactNumberFormat {

    public static void main(String[] args) {
        var number = 10000;
        var f = NumberFormat.getCompactNumberInstance();
        var result = f.format(number);
        System.out.println(result);

    }
}