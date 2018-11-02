package org.jonnyzzz.demo

class Foo {

  @JvmName("foo`Q")
  fun foo(l: List<Q>) = Unit

  @JvmName("foo`P")
  fun foo(l: List<P>) = Unit


  class Q
  class P


  inline fun <reified T> guess(list: List<T>)
          = T::class.java




}