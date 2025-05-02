// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0100_MainMethodFirst.java on 2025-05-02T19:28:30.552613Z
interface App {

  static void main(String... args) {
    Message.print();
  }
}

interface Message {

  static void print() {
    System.out.println("have a nice day");
  }
}