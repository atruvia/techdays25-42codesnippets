// Copied from file:/Users/xhu1006/git/atruvia/techdays25-42codesnippets/own/OpenShiftTemplateValidator.java on 2025-05-13T08:47:33.338491Z
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S50_OpenShiftTemplateValidator {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Bitte Pfad zur OpenShift Template-Datei als Argument übergeben.");
            System.exit(1);
        }

        String filePath = args[0];
        String content;

        try {
            content = Files.readString(Paths.get(filePath));
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
            return;
        }

        List<String> lines = Arrays.asList(content.split("\n"));

        Set<String> definedParams = extractParametersFromSection(lines);
        Set<String> usedParams = extractUsedParameters(content);

        System.out.println("Definierte Parameter: " + definedParams);
        System.out.println("Verwendete Parameter: " + usedParams);

        // 1. Nicht verwendete definierte Parameter
        Set<String> unusedParams = new TreeSet<>(definedParams);
        unusedParams.removeAll(usedParams);

        if (unusedParams.isEmpty()) {
            System.out.println("✅ Alle definierten Parameter werden im Template verwendet.");
        } else {
            System.out.println("⚠️ Nicht verwendete Parameter:");
            unusedParams.forEach(p -> System.out.println("  - " + p));
        }

        // 2. Verwendete, aber nicht deklarierte Parameter
        Set<String> undeclaredParams = new TreeSet<>(usedParams);
        undeclaredParams.removeAll(definedParams);

        if (undeclaredParams.isEmpty()) {
            System.out.println("✅ Keine Verwendung von nicht deklarierten Parametern.");
        } else {
            System.out.println("❌ Verwendete, aber nicht deklarierte Parameter:");
            undeclaredParams.forEach(p -> System.out.println("  - " + p));
        }
    }

    private static Set<String> extractParametersFromSection(List<String> lines) {
        Set<String> params = new HashSet<>();
        boolean inParametersSection = false;
        int indentLevel = -1;

        for (String line : lines) {
            String trimmed = line.trim();
            if (trimmed.startsWith("parameters:")) {
                inParametersSection = true;
                indentLevel = countLeadingSpaces(line);
                continue;
            }

            if (inParametersSection) {
                int currentIndent = countLeadingSpaces(line);
                if (currentIndent <= indentLevel && !trimmed.startsWith("- name:")) {
                    break;
                }

                Matcher matcher = Pattern.compile("-\\s*name:\\s*\"?([A-Za-z_][A-Za-z0-9_]*)\"?").matcher(trimmed);
                if (matcher.find()) {
                    params.add(matcher.group(1));
                }
            }
        }
        return params;
    }

    private static int countLeadingSpaces(String line) {
        int count = 0;
        while (count < line.length() && line.charAt(count) == ' ') {
            count++;
        }
        return count;
    }

    private static Set<String> extractUsedParameters(String content) {
        Set<String> used = new HashSet<>();
        Pattern pattern = Pattern.compile("\\$\\{\\{?([A-Za-z_][A-Za-z0-9_]*)}}?");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            used.add(matcher.group(1));
        }
        return used;
    }
}
