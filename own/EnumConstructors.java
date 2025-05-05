// Inspired by https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0144_EnumConstructors.java on 2025-05-02T13:37:27.944138Z
interface EnumConstructors {

  public enum HttpStatus {
    OK(200, "OK"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_ERROR(500, "Internal Server Error");

    private final int code;
    private final String reason;

    HttpStatus(int code, String reason) {
      this.code = code;
      this.reason = reason;
    }

    public int getCode() {
      return code;
    }

    public String getReason() {
      return reason;
    }

    public static HttpStatus fromCode(int code) {
      for (HttpStatus status : values()) {
        if (status.code == code) {
          return status;
        }
      }
      throw new IllegalArgumentException("Unknown code: " + code);
    }
  }

  static void main(String... args) {
    HttpStatus status = HttpStatus.NOT_FOUND;
    System.out.println(status.getCode()); // 404
    System.out.println(status.getReason()); // Not Found

    System.out.println(HttpStatus.fromCode(500)); // INTERNAL_ERROR
  }
}