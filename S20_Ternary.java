// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0044_Ternary.java on 2025-04-10T19:24:02.356762Z
interface S20_Ternary {

  static void main(String... args) {
    var input = "";
    var developer = input.isBlank()?"duke":input;
    System.out.println(developer);
  }
}