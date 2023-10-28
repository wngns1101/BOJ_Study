n = int(input())
nums = []
for _ in range(n):
    nums.append(list(map(int, input().split(" "))))
nums.sort(key=lambda x: (x[1], x[0]))
for x, y in nums:
    print(x, y)