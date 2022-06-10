package it.academy;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ReadFile {

  public static void main(String[] args) throws IOException {
    try (InputStream inputStream = ReadFile.class.getClassLoader().getResource("readMe.txt").openStream()) {
      System.out.println(new String(inputStream.readAllBytes(), StandardCharsets.UTF_8));
    }
  }
}
