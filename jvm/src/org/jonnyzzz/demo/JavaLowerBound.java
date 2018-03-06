package org.jonnyzzz.demo;

public class JavaLowerBound {


  interface IA {
    void bar();
  }

  interface IB {
    void foo();
  }


  class Foo2<T extends JavaLowerBound & IA & IB> {
    T t;

    void baz() {
      t.foo();
      t.bar();
    }
  }

}
