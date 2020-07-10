package com.oranda.graph

object PathFinderExample extends App {
  val (nodes, edges) = GraphReader.readFile("in-path.txt")
  val pathsFound = PathFinder.findAllPaths(nodes, edges)
  for (path <- pathsFound)
    println(path)
}
