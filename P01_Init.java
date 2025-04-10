import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger.Level;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;
import java.util.List;

interface P01_Init {

    String SOURCE_AB = "https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/";
    String SOURCE_OWN = "file://" + System.getProperty("user.dir") + "/own/";

    static void main(String... args) throws IOException {
        var in = List.of(
                input(SOURCE_AB, "S0000_BoringMain"),
                input(SOURCE_AB, "S0001_Executable"),
                input(SOURCE_AB, "S0002_MainInterface"),
                input(SOURCE_AB, "S0058_ShortestMain"),
                input(SOURCE_AB, "S0100_MainMethodFirst"),
                input(SOURCE_AB, "S0004_Timer"),
                input(SOURCE_AB, "S0005_ScheduledThreadPool"),
                input(SOURCE_AB, "S0006_FileWatch"),
                // own Clipboard aus Base64 dekodieren
                input(SOURCE_AB, "S0010_ReadFromConsole"),
                input(SOURCE_AB, "S0011_ReadPassword"),
                input(SOURCE_AB, "S0013_Emoji"), // mit 0079,0083 ergänzen
                input(SOURCE_AB, "S0014_SystemOutInColor"),
                input(SOURCE_AB, "S0021_TerminalReset"),
                input(SOURCE_AB, "S0022_CompactNumberFormat"),
                input(SOURCE_AB, "S0023_UnderscoresInNumbers"),
                input(SOURCE_AB, "S0015_BuiltInLogger"), // evtl mit 0078 ergänzen
                input(SOURCE_AB, "S0020_Assert"),
                input(SOURCE_AB, "S0024_FunctionalInterface"),
                input(SOURCE_AB, "S0026_AttributeDefaultOptional"),
                input(SOURCE_AB, "S0044_Ternary"),
                input(SOURCE_AB, "S0027_ObjectsPreconditions"),
                input(SOURCE_AB, "S0028_Formatted"),
                input(SOURCE_AB, "S0029_PositionInFormatted"),
                input(SOURCE_AB, "S0030_CreateTempFolder"),
                input(SOURCE_AB, "S0032_DirectoryStream"),
                input(SOURCE_AB, "S0035_LinesString"),
                input(SOURCE_AB, "S0037_FileCopy"),
                input(SOURCE_AB, "S0039_EndlessStreams"),
                input(SOURCE_AB, "S0040_SoutRedirect"),
                input(SOURCE_AB, "S0041_TimeVsChronoUnit"),
                input(SOURCE_AB, "S0043_JWTDecoder"),
                input(SOURCE_AB, "S0051_Frequency"),
                input(SOURCE_AB, "S0055_FlatMap"),
                input(SOURCE_AB, "S0059_FetchAsyncHttpClient"),
                input(SOURCE_AB, "S0061_SwitchWithRecords"), // opt
                input(SOURCE_AB, "S0063_ShorterInterfaceFields"), // opt
                input(SOURCE_AB, "S0065_ClipboardWasher"),
                input(SOURCE_AB, "S0067_ListLastElement"), // opt
                input(SOURCE_AB, "S0070_LeadingZeroFormatting"),
                input(SOURCE_AB, "S0071_CloseIOStreams"), // opt
                input(SOURCE_AB, "S0084_ReadingIntStreams"),
                input(SOURCE_AB, "S0100_EasyFiles"),
                input(SOURCE_AB, "S0145_EasyISOInstant"),
                input(SOURCE_AB, "S0141_InstantParse"),
                input(SOURCE_AB, "S0100_NicerSleep"),
                input(SOURCE_AB, "S0100_ParsingWithScanner"),
                input(SOURCE_AB, "S0119_1000TimesSorry"),
                input(SOURCE_AB, "S0144_EnumConstructors"),
                input(SOURCE_AB, "S0148_CustomIterableForEach"),
                input(SOURCE_AB, "S0170_Clock"));
        copy(in);
    }

    static void copy(List<Input> ins) throws IOException {
        int i = 1;
        for (Input in : ins) {
            String dstFilename = "S" + "%02d".formatted(i) + "_" + in.filename.replaceFirst("^.*?_", "");

            URL url = URI.create(in.prefix + in.filename + ".java").toURL();

            // Read all content into a String
            String content;
            try (InputStream inStream = url.openStream()) {
                content = new String(inStream.readAllBytes(), java.nio.charset.StandardCharsets.UTF_8);
            }
            content = content.replace(in.filename, dstFilename);
            content = content.replaceFirst("(?m)^package\\s+[^;]+;", "");

            // Add source info
            content = "// Copied from " + url + " on " + Instant.now() + System.lineSeparator() + content;

            // Write modified content to file
            Files.writeString(Path.of(dstFilename + ".java"), content, StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
            System.getLogger("main").log(Level.INFO, "Copied {0} to {1}",in.filename, dstFilename);
            i++;
        }

    }

    static Input input(String prefix, String filename) {
        return new Input(prefix, filename);
    }

    class Input {
        String prefix;
        String filename;

        private Input(String prefix, String filename) {
            this.prefix = prefix;
            this.filename = filename;
        }

    }

}