num = int(input())
a = list(map(int, input().split(" ")))
checkNum = int(input())
result = 0
for i in a:
    if i == checkNum:
        result += 1
print(result)