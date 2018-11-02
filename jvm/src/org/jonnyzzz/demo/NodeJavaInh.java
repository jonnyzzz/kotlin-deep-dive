package org.jonnyzzz.demo;

public class NodeJavaInh extends NodeJava<String> {
  public NodeJavaInh(String value) {
    super(value);
  }

  @Override
  public void setValue(String value) {

  }

  public static void main(String[] args) {
    NodeJava i = new NodeJavaInh("@jonnyzzz");
    i.setValue(new Object());
  }
}
