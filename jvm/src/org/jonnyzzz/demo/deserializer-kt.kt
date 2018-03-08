package org.jonnyzzz.demo

class DeserializerKt {

  inline fun <reified T> load(): T {
    return Any() as T
  }

  fun usage() {
    val list: List<String> = load()

    println(list)
  }



}

fun main(args: Array<String>) {
  DeserializerKt().usage()
}




