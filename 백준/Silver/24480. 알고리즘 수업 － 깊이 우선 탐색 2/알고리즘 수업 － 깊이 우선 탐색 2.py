import sys
sys.setrecursionlimit(10**8)

def DFS(r):
    global count
    visited[r] = count
    stack[r].sort(reverse=True)
    for i in stack[r]:
        if visited[i] == 0:
            count += 1
            DFS(i)


n, m, r = map(int, sys.stdin.readline().strip().split())
stack = [[] for _ in range(n+1)]
visited = [0] * (n+1)
count = 1

for _ in range(m):
    u, v = map(int, sys.stdin.readline().strip().split())
    stack[u].append(v)
    stack[v].append(u)

DFS(r)

for i in range(1, len(visited)):
    print(visited[i])