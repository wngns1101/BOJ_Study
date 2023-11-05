import sys
sys.setrecursionlimit(10**9)
input = sys.stdin.readline

n, m, r = map(int, input().split())

stack = [[] for _ in range(n+1)]
visited = [0] * (n + 1)
count = 1

for _ in range(m):
    u, v = map(int, input().split())
    stack[u].append(v)
    stack[v].append(u)

def DFS(v):
    global count
    visited[v] = count
    stack[v].sort()
    for i in stack[v]:
        if visited[i] == 0:
            count += 1
            DFS(i)


DFS(r)

for i in range(1, n + 1):
    print(visited[i])