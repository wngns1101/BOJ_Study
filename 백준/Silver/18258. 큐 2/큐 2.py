from collections import deque
import sys

n = int(input())
queue = deque()
for _ in range(n):
    sentense = sys.stdin.readline().split()
    if sentense[0] == "push":
        queue.append(int(sentense[1]))
    elif sentense[0] == "pop":
        if not queue:
            print(-1)
        else:
            print(queue.popleft())
    elif sentense[0] == "size":
        print(len(queue))
    elif sentense[0] == "empty":
        if not queue:
            print(1)
        else:
            print(0)
    elif sentense[0] == "front":
        if not queue:
            print(-1)
        else:
            print(queue[0])
    elif sentense[0] == "back":
        if not queue:
            print(-1)
        else:
            print(queue[-1])