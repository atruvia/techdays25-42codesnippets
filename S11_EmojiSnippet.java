// Copied from file:/Users/xcg6892/git/_atruvia-other/techdays25-42codesnippets/own/EmojiSnippet.java on 2025-05-13T18:04:31.642708Z
// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0013_Emoji.java on 2025-05-02T13:37:27.134658Z

import java.util.stream.IntStream;
import java.io.IOException;
import java.lang.Character;

public class S11_EmojiSnippet {

    static final String ROCKET = "🚀";

    record Emoji(int codePoint) {
        String name() {
            return Character.getName(codePoint)
                    .toLowerCase();
        }

        String emoji() {
            return String.valueOf(Character.toChars(codePoint));
        }

        public String toString() {
            return "%s -> %s".formatted(name(), emoji());
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(ROCKET);

        // from
        // https://github.com/AdamBien/best-of-java-shorts/blob/main/S0079_AllEmojis.java
        System.out.println(Character.isEmoji(0));
        IntStream.range(0, Integer.MAX_VALUE)
                .filter(Character::isEmoji)
                .mapToObj(Character::toChars)
                .map(String::valueOf)
                .forEach(System.out::print);

        System.in.read();

        // from
        // https://github.com/AdamBien/best-of-java-shorts/blob/main/S0083_PrintEmojisWithName.java
        IntStream.range(0, Integer.MAX_VALUE)
                .filter(Character::isEmoji)
                .mapToObj(Emoji::new)
                .forEach(System.out::println);

    }
}