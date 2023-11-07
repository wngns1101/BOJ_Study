from collections import deque
import sys

def DFS(graph, d):
    dfsResult[d] = True
    print(d, end=' ')
    for i in graph[d]:
        if not dfsResult[i]:
            DFS(graph, i)

def BFS(graph, b):
    bfsResult[b] = True
    queue = deque()
    queue.append(b)
    while queue:
        q = queue.popleft()
        print(q, end=' ')
        for i in graph[q]:
            if not bfsResult[i]:
                queue.append(i)
                bfsResult[i] = True


n, m, v = map(int, sys.stdin.readline().strip().split())
graph = [[] for _ in range(n+1)]
dfsResult = [False] * (n+1)
bfsResult = [False] * (n+1)

for _ in range(m):
    x, y = map(int, sys.stdin.readline().strip().split())
    graph[x].append(y)
    graph[y].append(x)

graph = [sorted(i) for i in graph]

DFS(graph, v)
print()
BFS(graph, v)