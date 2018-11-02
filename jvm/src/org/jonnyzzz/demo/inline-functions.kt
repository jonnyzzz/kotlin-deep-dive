package org.jonnyzzz.demo


fun lock() = Unit
fun release() = Unit

inline fun foo(x: () -> Unit) {
  lock()

  try {
    x()
  } finally {
    release()
  }
}

fun main(args: Array<String>) {

  foo { println() }

}

