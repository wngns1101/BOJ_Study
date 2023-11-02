import sys
from collections import deque

n, index = map(int, sys.stdin.readline().split())

queue = deque()
for i in range(1, n+1):
    queue.append(i)

sortNums = []
while len(queue) != 0:
    for _ in range(index-1):
        queue.append(queue.popleft())
    sortNums.append(queue.popleft())

print('<', end='')
for i in range(0, len(sortNums)-1):
    print(str(sortNums[i])+', ', end='')
print(str(sortNums[-1])+'>')
