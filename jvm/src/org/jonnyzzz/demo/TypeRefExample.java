package org.jonnyzzz.demo;

import java.util.List;
import java.util.Map;

public class TypeRefExample {
  private static <T> T deserialize(TypeRef<T> o) { return null;}

  public static void main(String[] args) {


    final Map<String, List<Long>> map =
            deserialize(
                    new TypeRef<Map<String, List<Long>>>() {});




  }
}
