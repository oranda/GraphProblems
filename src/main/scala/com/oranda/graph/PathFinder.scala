package com.oranda.graph

/**
  * Find all paths in a Directed Acyclic Graph (DAG).
  *
  * @author James McCabe
  */
object PathFinder {

  def findAllPaths(allNodes: Set[Int], edges: Seq[Edge]): Seq[Path] = {

    def children(node: Int): Set[Int] =
      edges.filter(_.u == node).map(_.v).toSet

    def findPathsForNode(node: Int): Set[Path] = {
      val childNodes = children(node)
      if (childNodes.isEmpty)
        Set(Path(List(node)))
      else
        childNodes.flatMap(findPathsForNode).map(_.prepend(node))
    }

    val nodesWithIncoming = edges.map(_.v).toSet
    val sourceNodes = allNodes.diff(nodesWithIncoming)
    val paths = sourceNodes.toSeq.flatMap(findPathsForNode)

    paths.sortBy(_.first)
  }
}
