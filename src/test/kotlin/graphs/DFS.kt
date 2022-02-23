package graphs

fun main() {

    val i = Node("I")
    val j = Node("J")
    val k = Node("K")

    val e = Node("E")
    val f = Node("F")

    f.children.addAll(listOf(i,j))

    val g = Node("G")
    g.children.add(k)

    val h = Node("H")

    val b = Node("B")
    b.children.add(e)
    b.children.add(f)

    val c = Node("C")

    val d = Node("D")
    d.children.add(g)
    d.children.add(h)

    val graph = Node("A")
    graph.children.add(b)
    graph.children.add(c)
    graph.children.add(d)


    print(graph.depthFirstSearch())
}

class Node(private val name: String) {
    val children: MutableList<Node> = mutableListOf()

    fun depthFirstSearch(): List<String> {
        return depthFirstSearch(mutableListOf())
    }

    private fun depthFirstSearch(dfsList: MutableList<String>): List<String> {
        dfsList.add(this.name)
        for (node in this.children) {
            node.depthFirstSearch(dfsList)
        }

        return dfsList
    }
}