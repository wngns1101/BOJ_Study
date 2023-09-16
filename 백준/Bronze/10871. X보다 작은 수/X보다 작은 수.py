count, measure = map(int, input().split(" "))
nums = list(map(int, input().split(" ")))
result = ''
for n in nums:
    if n < measure:
        result += str(n) + ' '
print(result[:-1])
