package org.jonnyzzz.demo

inline fun <reified T> deserialize() : T {
  println(typeRef<T>())
  TODO()
}

fun main(args: Array<String>) {

  val map = deserialize<Map<String, List<Long>>>()

}

