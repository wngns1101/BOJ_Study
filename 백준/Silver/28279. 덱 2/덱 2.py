from collections import deque
import sys

n = int(sys.stdin.readline())
queue = deque()

for _ in range(n):
    num = list(map(int, sys.stdin.readline().strip().split()))
    l = len(queue)

    if num[0] == 1:
        queue.appendleft(num[1])

    elif num[0] == 2:
        queue.append(num[1])

    elif num[0] == 3:
        if l:
            print(queue.popleft())
        else:
            print(-1)

    elif num[0] == 4:
        if l:
            print(queue.pop())
        else:
            print(-1)

    elif num[0] == 5:
        print(len(queue))

    elif num[0] == 6:
        if not queue:
            print(1)
        else:
            print(0)

    elif num[0] == 7:
        if l:
            print(queue[0])
        else:
            print(-1)

    elif num[0] == 8:
        if l:
            print(queue[-1])
        else:
            print(-1)