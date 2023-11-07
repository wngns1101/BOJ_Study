from collections import deque

totalCount = int(input())
comCount = int(input())
graph = [[] for _ in range(totalCount+1)]
virus = [0] * (totalCount+1)
count = 1


def BFS(b):
    global count
    virus[b] = count
    queue = deque()
    queue.append(b)
    while queue:
        q = queue.popleft()
        for i in graph[q]:
            if virus[i] == 0:
                virus[i] = count
                count += 1
                queue.append(i)


for _ in range(1, comCount+1):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

BFS(1)

print(count-1)