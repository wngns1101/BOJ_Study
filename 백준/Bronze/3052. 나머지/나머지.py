nums = [int(input()) for _ in range(10)]
result = []
count = 0
for n in nums:
    remain = n % 42
    if remain not in result:
        result.append(remain)
        count += 1
print(count)


