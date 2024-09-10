lateinit var graph: Array<MutableList<Int>>
lateinit var visited: IntArray
var cnt = 1

fun main() {
    val str = readln().split(" ").map { it.toInt() }
    val point = str[0]
    val node = str[1]
    var startPoint = str[2]
    graph = Array(point+1) {mutableListOf<Int>()}
    visited = IntArray(point + 1) {0}
    repeat(node) {
        val str = readln().split(" ").map { it.toInt() }
        val point = str[0]
        val node = str[1]
        graph[point].add(node)
        graph[node].add(point)
    }

    graph.map { it.sort() }

    dfs(startPoint)

    for(i in 1 until visited.size) {
        println(visited[i])
    }

}

fun dfs(start: Int) {
    if (visited[start] != 0) return
    visited[start] = cnt++
    graph[start].forEach {
        dfs(it)
    }
}