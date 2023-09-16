num = 0
resultIndex = 0
resultNum = 0
result = {}
for i in range(9):
    result[i] = int(input())
for i, j in result.items():
    if num < j:
        num = j
        resultIndex = i
        resultNum = j
print(resultNum)
print(resultIndex+1)