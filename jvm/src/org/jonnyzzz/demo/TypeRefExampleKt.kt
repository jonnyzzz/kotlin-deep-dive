package org.jonnyzzz.demo

inline fun <reified T> deserialize() : T {
  println(T::class.java)

  println(typeRef<T>())


  TODO()
}

fun main(args: Array<String>) {

  val map = deserialize<Map<String, List<Long>>>()

}

