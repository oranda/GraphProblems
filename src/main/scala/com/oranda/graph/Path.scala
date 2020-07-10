package com.oranda.graph

case class Path(path: List[Int]) {
  require(path.nonEmpty)

  def prepend(node: Int): Path = Path(node +: path)

  def first: Int = path.head

  override def toString: String = path.mkString("->")
}
