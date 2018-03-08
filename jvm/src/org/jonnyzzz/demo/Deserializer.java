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


    List<String> List = load(List.class);

    List<String> list = load();



  }
}
