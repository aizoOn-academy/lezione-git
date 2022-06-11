package it.academy;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

  public static void main(String[] args) throws IOException, URISyntaxException {
    Path path = Paths.get(ReadFile.class.getClassLoader()
        .getResource("readMe.txt").toURI());

    try (Stream<String> lines = Files.lines(path)) {
      lines.forEach(System.out::println);
      System.out.println("ciao mondo");
      System.out.println("MODIFICA");
    }

  }
}
