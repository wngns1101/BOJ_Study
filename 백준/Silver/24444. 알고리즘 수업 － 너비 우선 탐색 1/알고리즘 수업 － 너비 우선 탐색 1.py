from collections import deque
import sys

sys.setrecursionlimit(10 ** 8)


def BFS(v):
    global count
    visited[v] = count
    queue = deque()
    queue.append(v)
    while queue:
        p = queue.popleft()
        stack[p].sort()
        for s in stack[p]:
            if visited[s] == 0:
                count += 1
                visited[s] = count
                queue.append(s)



n, m, r = map(int, sys.stdin.readline().strip().split())
stack = [[] for _ in range(n + 1)]
visited = [0] * (n + 1)
count = 1

for _ in range(m):
    u, v = map(int, sys.stdin.readline().strip().split())
    stack[u].append(v)
    stack[v].append(u)

BFS(r)

for i in range(1, n+1):
    print(visited[i])