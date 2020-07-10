package com.oranda.graph

import org.scalatest.WordSpec

/**
  * @author James McCabe
  */
class PathFinderSpec extends WordSpec {
  "PathFinder" must {
    "find the paths" in {
      val (nodes, edges) = GraphReader.readFile("in-path.txt")
      val pathsFound = PathFinder.findAllPaths(nodes, edges)
      val pathsExpected = Seq(Path(List(1,2,4)), Path(List(1,3,4)), Path(List(5,6)))
      assert(pathsFound == pathsExpected)
    }
  }
}
