// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0044_Ternary.java on 2025-05-02T19:28:33.178323Z
interface S20_Ternary {

  static void main(String... args) {
    var input = "";
    var developer = input.isBlank()?"duke":input;
    System.out.println(developer);
  }
}