import java.util.*

lateinit var graph: Array<MutableList<Int>>
lateinit var visited: IntArray
var order: Int = 1

fun main() {
    val (point, node, startPoint) = readln().split(" ").map{it.toInt()}
    graph = Array(point+1){ mutableListOf() }
    visited = IntArray(point+1){0}

    repeat(node) {
        val str = readln().split(" ").map{it.toInt()}
        graph[str[0]].add(str[1])
        graph[str[1]].add(str[0])
    }

    graph.forEach{it.sort()}

    bfs(startPoint)

    for(i in 1..visited.size-1) {
        println(visited[i])
    }
}

fun bfs(startPoint: Int) {
    val queue: Queue<Int> = LinkedList()
    queue.add(startPoint)
    visited[startPoint] = order++

    while (queue.isNotEmpty()) {
        var current = queue.poll()
        for (next in graph[current]) {
            if (visited[next] == 0) {
                visited[next] = order++
                queue.add(next)
            }
        }
    }
}