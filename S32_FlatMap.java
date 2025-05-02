// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0055_FlatMap.java on 2025-05-02T19:28:35.326769Z
import java.util.stream.Stream;

public class S32_FlatMap {

    static Stream<String> addPrefix(String prefix) {
        return Stream
                .of("java", "duke")
                .map(s -> prefix + " " + s);
    }

    public static void main(String[] args) {
        var messages = Stream
                .of("hey", "hi")
                .flatMap(S32_FlatMap::addPrefix)
                .toList();
        System.out.println(messages);

    }

}