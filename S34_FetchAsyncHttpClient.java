// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0059_FetchAsyncHttpClient.java on 2025-04-10T19:24:02.611888Z
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

interface S34_FetchAsyncHttpClient {

  static void onFetch(String content) {
    System.out.println(content);
  }

  static void fetch(URI uri) throws Exception {
    try (var httpClient = HttpClient.newHttpClient()) {
      var req = HttpRequest.newBuilder(uri)
          .GET()
          .build();
      httpClient
          .sendAsync(req, BodyHandlers.ofString())
          .thenApply(HttpResponse::body)
          .thenAccept(S34_FetchAsyncHttpClient::onFetch);
    }
  }

  static void main(String... args) throws Exception {
    var uri = URI.create("https://airhacks.fm");
    fetch(uri);
  }
}