from collections import deque
import sys

sys.setrecursionlimit(10 ** 8)


def BFS(b):
    global count
    visited[b] = count
    queue = deque()
    queue.append(b)
    while queue:
        p = queue.popleft()
        stack[p].sort(reverse=True)
        for i in stack[p]:
            if visited[i] == 0:
                count += 1
                visited[i] = count
                queue.append(i)


n, m, r = map(int, sys.stdin.readline().strip().split())
visited = [0] * (n + 1)
stack = [[] for _ in range(n + 1)]
count = 1

for _ in range(m):
    u, v = map(int, sys.stdin.readline().strip().split())
    stack[u].append(v)
    stack[v].append(u)

BFS(r)

for i in visited[1:]:
    print(i)