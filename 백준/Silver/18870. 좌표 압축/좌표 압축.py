import sys
input = sys.stdin.readline
n = int(input())
nums = list(map(int, input().split(" ")))
sortNums = sorted(list(set(nums)))
dict = {sortNums[i]: i for i in range(len(sortNums))}
for i in nums:
    print(dict[i], end=' ')