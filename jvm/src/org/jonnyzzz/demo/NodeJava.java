package org.jonnyzzz.demo;

public class NodeJava<T> {
  private T value;

  public NodeJava(T value) {
    this.value = value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

/*

  public <Q> void foo(Q q) {
    Class c = String.class;
    Class d = Q.class; //NOT ALLOWED
  }
*/

}

