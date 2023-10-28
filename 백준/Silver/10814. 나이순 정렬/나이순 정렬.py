n = int(input())
nums = []
for _ in range(n):
    nums.append(input().split(" "))
nums.sort(key=lambda x: (int(x[0]), nums.index))
for x, y in nums:
    print(int(x),y)