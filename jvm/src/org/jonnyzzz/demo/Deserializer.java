package org.jonnyzzz.demo;

import java.util.List;
import java.util.Map;

public class Deserializer {

  <T> T load() {
    return (T) new Object();
  }

  <T> T load(Class<T> clazz) {
    return (T) new Object();
  }

  public void usage() {
    List<String> b = load();
    List<String> a = load(List.class);

    System.out.println(a);
    System.out.println(b);

  }

  public static void main(String[] args) {
    new Deserializer().usage();
  }
}
