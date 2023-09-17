basket, cycle = map(int, input().split(" "))
result = []
for i in range(1, basket+1):
    result.append(i)
for i in range(cycle):
    change1, change2 = map(int, input().split(" "))
    temp = result[change1-1]
    result[change1-1] = result[change2-1]
    result[change2-1] = temp
print(*result)
    
    