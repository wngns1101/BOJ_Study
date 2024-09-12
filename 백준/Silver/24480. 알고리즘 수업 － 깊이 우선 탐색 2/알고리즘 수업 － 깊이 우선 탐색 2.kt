lateinit var graph: Array<MutableList<Int>>
lateinit var visited: IntArray
var order = 0

fun main() {
    val (point, node, firstNode) = readln().split(" ").map { it.toInt() }
    graph = Array(point + 1) { mutableListOf() }
    visited = IntArray(point + 1)

    repeat(node) {  // 간선 개수만큼 반복
        val (u, v) = readln().split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }

    // 인접 리스트 내림차순 정렬
    graph.forEach { it.sortDescending() }

    dfs(firstNode)

    // 방문 순서 출력
    for (i in 1 until visited.size) {
        println(visited[i])
    }
}

fun dfs(node: Int) {
    visited[node] = ++order  // 방문 순서 저장

    for (next in graph[node]) {
        if (visited[next] == 0) {
            dfs(next)
        }
    }
}
