package org.jonnyzzz.demo

import java.lang.reflect.Type


inline fun <reified T> typeRef() : Type
        = object : TypeRef<T>() {}
        .javaClass
        .genericSuperclass



fun main(args: Array<String>) {

  val t = typeRef<Map<List<String>, List<Long>>>()


  val j = typeRef<List<List<String>>>()


  println(t)
  println(j)


}


