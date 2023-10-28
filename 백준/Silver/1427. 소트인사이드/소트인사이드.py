num = input()
nums = []
for i in num:
    nums.append(int(i))
nums.sort(reverse=True)
for i in nums:
    print(i, end='')