area = [[0]*100 for _ in range(100)]

count = int(input())
for c in range(count):
    x, y = map(int, input().split())
    for i in range(x, x+10):
        for j in range(y, y+10):
            area[i][j] = 1
result = sum(sum(row) for row in area)
print(result)