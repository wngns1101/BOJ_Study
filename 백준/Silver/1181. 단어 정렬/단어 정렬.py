n = int(input())
nums = []
for _ in range(n):
    s = input()
    if s not in nums:
        nums.append(s)
nums.sort(key=lambda x: (len(x), x))
for s in nums:
    print(s)