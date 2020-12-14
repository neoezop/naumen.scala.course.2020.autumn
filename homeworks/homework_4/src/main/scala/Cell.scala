trait Cell{
  val value : Any = "empty"
  override def toString: String = value.toString
}