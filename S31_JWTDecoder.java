// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0043_JWTDecoder.java on 2025-05-02T12:04:22.834967Z
import java.util.Base64;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface S31_JWTDecoder {

  static void main(String... args) {
    var parts = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
        .split("\\.");
    var result = Stream.of(parts)
    .limit(2)
    .map(Base64.getDecoder()::decode)
    .map(String::new)
    .collect(Collectors.joining(","));
    System.out.println(result);
  }
}