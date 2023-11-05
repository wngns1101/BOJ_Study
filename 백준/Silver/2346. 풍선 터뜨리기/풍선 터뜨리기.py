from collections import deque

n = int(input())
queue = deque(enumerate(map(int, input().split())))
result = []

while queue:
    i, v = queue.popleft()
    result.append(i + 1)

    if v > 0:
        queue.rotate(-(v - 1))
    elif v < 0:
        queue.rotate(-v)

print(*result)
