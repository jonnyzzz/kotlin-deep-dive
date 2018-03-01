package org.jonnyzzz.demo


open class NodeKotlin<T>(var value : T)

class NodeKotlinInh(value: String) : NodeKotlin<String>(value)

