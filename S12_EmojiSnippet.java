// Copied from file:/Users/xcg6892/git/_atruvia-other/techdays25-42codesnippets/own/EmojiSnippet.java on 2025-05-02T14:06:48.943070Z
// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0013_Emoji.java on 2025-05-02T13:37:27.134658Z

import java.util.stream.IntStream;
import static java.lang.Character.getName;
import static java.lang.Character.toChars;

public class S12_EmojiSnippet {

    static final String ROCKET = "🚀";

    record Emoji(int codePoint) {
        String name() {
            return getName(codePoint)
                    .toLowerCase();
        }

        String emoji() {
            return String.valueOf(toChars(codePoint));
        }

        public String toString() {
            return "%s -> %s".formatted(name(), emoji());
        }
    }

    public static void main(String[] args) {
        System.out.println(ROCKET);

        // from
        // https://github.com/AdamBien/best-of-java-shorts/blob/main/S0079_AllEmojis.java
        System.out.println(Character.isEmoji(0));
        IntStream.range(0, Integer.MAX_VALUE)
                .filter(Character::isEmoji)
                .mapToObj(Character::toChars)
                .map(String::valueOf)
                .forEach(System.out::print);

        // from
        // https://github.com/AdamBien/best-of-java-shorts/blob/main/S0083_PrintEmojisWithName.java
        IntStream.range(0, Integer.MAX_VALUE)
                .filter(Character::isEmoji)
                .mapToObj(Emoji::new)
                .forEach(System.out::println);

    }
}