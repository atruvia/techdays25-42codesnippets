// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0055_FlatMap.java on 2025-05-14T07:01:22.452995Z
import java.util.stream.Stream;

public class S33_FlatMap {

    static Stream<String> addPrefix(String prefix) {
        return Stream
                .of("java", "duke")
                .map(s -> prefix + " " + s);
    }

    public static void main(String[] args) {
        var messages = Stream
                .of("hey", "hi")
                .flatMap(S33_FlatMap::addPrefix)
                .toList();
        System.out.println(messages);

    }

}