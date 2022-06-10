package it.academy;

import java.io.IOException;
import java.io.InputStreamReader;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class ReadCsv {

  public static void main(String[] args) throws IOException {
    try (var inputStream = new InputStreamReader(
        ReadCsv.class.getClassLoader().getResource("readCsv.csv").openStream())) {
      CsvToBean<Persona> build = new CsvToBeanBuilder<Persona>(inputStream)
          .withType(Persona.class)
          .withSeparator(';')
          .withIgnoreEmptyLine(true)
          .withIgnoreLeadingWhiteSpace(true)
          .build();

      build.stream().forEach(persona -> System.out.println(persona.toString()));
    }
  }

  public static class Persona {
    private int id;
    private String nome;
    private String cognome;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getCognome() {
      return cognome;
    }

    public void setCognome(String cognome) {
      this.cognome = cognome;
    }

    @Override
    public String toString() {
      return "Persona{" +
             "id=" + id +
             ", nome='" + nome + '\'' +
             ", cognome='" + cognome + '\'' +
             '}';
    }
  }
}
