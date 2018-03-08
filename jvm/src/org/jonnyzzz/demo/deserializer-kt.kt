package org.jonnyzzz.demo

import java.lang.reflect.ParameterizedType

class DeserializerKt {

  abstract class TypeRef<T>

  inline fun <reified T> load(): T {
    val clazz = object : TypeRef<T>() {}.javaClass
    val fullType = (clazz.genericSuperclass as ParameterizedType).actualTypeArguments[0]

    println()
    println("Loading: $fullType")
    println()

    TODO("I have no idea how to implement it, sorry")
  }

  fun usage() {
    val list: List<String> = load()

    println(list)
  }

}

fun main(args: Array<String>) {
  DeserializerKt().usage()
}


