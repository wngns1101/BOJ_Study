import sys
input = sys.stdin.readline

n = int(input())
result = [0] * 10001

for _ in range(n):
    result[int(input())] += 1

for i in range(len(result)):
    if result[i] != 0:
        for _ in range(result[i]):
            print(i)