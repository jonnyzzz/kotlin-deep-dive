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
}

