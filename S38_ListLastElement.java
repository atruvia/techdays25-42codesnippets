// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0067_ListLastElement.java on 2025-05-14T07:01:23.873776Z
import java.util.List;

interface App {

  static void main(String... args) {
    var list = List.of("duke", "and", "java");
    var last = list.getLast();
    System.out.println(last);
    System.out.println(list.get(list.size()-1));

  }
}