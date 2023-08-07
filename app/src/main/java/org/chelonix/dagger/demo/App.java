package org.chelonix.dagger.demo;

import io.dagger.client.Client;
import io.dagger.client.Dagger;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println(fetchWebsite().substring(0, 300));
  }

  static String fetchWebsite() throws Exception {
    try (Client client = Dagger.connect()) {
      String output = client.pipeline("test")
          .container()
          .from("alpine")
          .withExec(List.of("apk", "add", "curl"))
          .withExec(List.of("curl", "-k", "https://dagger.io"))
          .stdout();
      return output;
    }
  }
}