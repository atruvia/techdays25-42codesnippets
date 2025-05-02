// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0026_AttributeDefaultOptional.java on 2025-05-02T19:28:32.960607Z
import static java.util.Optional.ofNullable;

interface S19_AttributeDefaultOptional {
  
  class Developer {
    private String name;
    private String language;

    public Developer(String name, String language) {
      this.name = ofNullable(name)
      .map(String::toUpperCase)
      .orElse("duke");
      this.language = ofNullable(language).orElse("j");
    }

    @Override
    public String toString() {
      return "Developer [name=" + name + ", language=" + language + "]";
    }
  }

  static void main(String... args) {
    var dev = new Developer(null, null);
    System.out.println(dev.toString());
  }
}