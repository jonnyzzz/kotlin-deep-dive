package org.jonnyzzz.demo

/*
  fun <Q> foo(q: Q) {
    val c = String::class.java
    val d = Q::class.java; //NOT ALLOWED
  }
*/


  inline fun <reified Q> foo(q: Q) {
    val c = String::class.java
    val d = Q::class.java; //YEAH!
  }


  inline fun <reified Q> quiz() {
    println(Q::class.java)

    println(object : TypeRef<Q>() {}
            .javaClass
            .genericSuperclass)
  }


fun main(args: Array<String>) {
  quiz<Map<String, Long>>()
}

