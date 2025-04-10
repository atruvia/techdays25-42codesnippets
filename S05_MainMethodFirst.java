// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0100_MainMethodFirst.java on 2025-04-10T19:24:02.101875Z
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