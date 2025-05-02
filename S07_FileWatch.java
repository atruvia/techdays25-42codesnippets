// Copied from https://raw.githubusercontent.com/AdamBien/best-of-java-shorts/main/S0006_FileWatch.java on 2025-05-02T19:28:31.116901Z
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;

interface S07_FileWatch {

  static void main(String... args) throws Exception {

    var watchService = FileSystems
        .getDefault()
        .newWatchService();
    var pathToWatch = Path.of(".");
    pathToWatch.register(watchService,
        StandardWatchEventKinds.ENTRY_CREATE);

    var key = watchService.take();
    key.pollEvents()
        .stream()
        .map(WatchEvent::context)
        .forEach(System.out::println);
  }
}