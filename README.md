This project is a place to collect work related to CS graph problems.

Most versions of Scala and sbt should work.

Download the project, navigate to the project root, and run:

```shell
sbt run
```

Directed Acyclic Graphs (DAGs)
=============================

_Finding all paths in a graph_

The sample input file `in-path.txt` contains the number of nodes (the 
first line) and the edges (the rest of the lines):

```shell
6
5 6
1 2
1 3
3 4
2 4
```                           

The output is:

```shell
[info] Running com.oranda.graph.PathFinderExample
1->2->4
1->3->4
5->6
```