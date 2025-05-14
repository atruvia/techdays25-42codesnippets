// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0063_ShorterInterfaceFields.java on 2025-05-14T07:01:23.414468Z
import java.lang.reflect.Field;

interface App {
  public interface Configuration {
    int MESSAGE = 43;
  }

  static void main(String... args)
      throws Exception {
    var fields = Configuration.class
        .getDeclaredFields();
    for (Field field : fields) {
      System.out.println(field);
      System.out.println(field.get(null));
    }
  }
}