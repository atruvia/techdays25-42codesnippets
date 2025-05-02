// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0055_FlatMap.java on 2025-05-02T13:37:27.679213Z
import java.util.stream.Stream;

public class S34_FlatMap {

    static Stream<String> addPrefix(String prefix) {
        return Stream
                .of("java", "duke")
                .map(s -> prefix + " " + s);
    }

    public static void main(String[] args) {
        var messages = Stream
                .of("hey", "hi")
                .flatMap(S34_FlatMap::addPrefix)
                .toList();
        System.out.println(messages);

    }

}