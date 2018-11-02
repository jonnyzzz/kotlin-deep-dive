open class NodeJS<T>(var value : T) {
  open fun foo(v : T) = Unit
}

class NodeJSInh(value: String) : NodeJS<String>(value){

  override fun foo(v: String) = Unit
}

