package com.oranda.graph

import java.io.{BufferedReader, FileReader}

object GraphReader {

  def readFile(pathToFile: String): (Set[Int], Seq[Edge]) = {
    def parseEdges(in: BufferedReader): Seq[Edge] = {
      val lines = Iterator.continually(in.readLine).takeWhile(_ != null).toSeq

      def parseEdge(line: String): Edge = {
        val tokens = line.trim.split(" ")
        Edge(tokens(0).toInt, tokens(1).toInt)
      }
      lines.map(parseEdge).sortBy(_.u)
    }

    val in = new BufferedReader(new FileReader(pathToFile))
    val firstLine = in.readLine.trim
    val n = firstLine.toInt
    val nodes = (1 to n).toSet // assuming it is 1-based
    val edges = parseEdges(in)
    (nodes, edges)
  }
}
