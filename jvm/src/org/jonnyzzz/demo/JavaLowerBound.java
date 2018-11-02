package org.jonnyzzz.demo;

import java.util.Collection;
import java.util.List;

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

  void foo(Collection<IA> a ) {}
  void foo(List<IB> a ) {}

}
