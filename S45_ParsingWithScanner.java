// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0100_ParsingWithScanner.java on 2025-05-02T19:28:37.928286Z
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

interface App {

  record Dev(String name, boolean javaDev,int age){}

  static void main(String... args) throws IOException {
    var path = Path.of("./devs.txt");
    try(var scanner = new Scanner(path)){
      while(scanner.hasNext()){
        var d = new Dev(
          scanner.next(),
          scanner.nextBoolean(),
          scanner.nextInt());
          System.out.println(d);
      }
    }
  }
}