package org.jonnyzzz.demo


open class NodeKotlin<T>(var value : T) {
  open fun foo(v : T) = Unit
}

class NodeKotlinInh(value: String) : NodeKotlin<String>(value){

  override fun foo(v: String) = Unit
}

