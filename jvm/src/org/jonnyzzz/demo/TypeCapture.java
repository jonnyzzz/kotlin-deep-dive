package org.jonnyzzz.demo;

import java.util.ArrayList;

public class TypeCapture {

  public static void main(String[] args) {

    //no type info
    printType(
            new ArrayList<String>()
    );


    //has type info
    printType(
            new ArrayList<String>() {}
    );
  }

  private static void printType(Object o) {
    System.out.println("type:    " + o.getClass());
    System.out.println("generic: " + o.getClass().getGenericSuperclass());
    System.out.println();
  }
}
