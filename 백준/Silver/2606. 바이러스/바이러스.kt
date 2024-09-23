lateinit var graph: List<MutableList<Int>>
lateinit var nodes: IntArray

fun main() {
    val index = readln().toInt()
    val node = readln().toInt()

    graph = List(index+1) { mutableListOf() }
    nodes = IntArray(index+1)

    repeat(node) {
        val (first, second) = readln().split(" ").map{it.toInt()}
        graph[first] += second
        graph[second] += first
    }

    bfs(1)

    println(nodes.filter { it != 0 }.count()-1)
}

fun bfs(start: Int) {
    nodes[start] = 1
    val node = graph[start]
    for (i in node) {
        if (nodes[i] == 0) {
            nodes[i] = 1
            bfs(i)
        }
    }
}