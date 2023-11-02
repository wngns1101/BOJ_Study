from collections import deque
import sys

queue = deque()
n = int(sys.stdin.readline())
if n == 1:
    print(1)
    exit()

for i in range(1, n + 1):
    queue.append(i)

while len(queue) != 1:
    queue.popleft()
    if len(queue) == 1:
        print(queue.pop())
        break
    queue.append(queue.popleft())
