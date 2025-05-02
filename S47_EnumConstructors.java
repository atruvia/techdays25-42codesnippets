// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0144_EnumConstructors.java on 2025-05-02T19:28:38.354770Z
interface App {

  enum Server{
    S(1,2),
    L(2,4);
    int cpu;
    int ram;
    private Server(int cpu, int ram) {
      this.cpu = cpu;
      this.ram = ram;
    }
    int ram(){
      return this.ram;
    }
    
  }


  static void main(String... args) {
    
  }
}