matrix1, matrix2 = [], []
n, m = map(int, input().split(" "))
for i in range(n):
    row = list(map(int, input().split(" ")))
    matrix1.append(row)
for i in range(n):
    row = list(map(int, input().split(" ")))
    matrix2.append(row)

for i in range(n):
    for j in range(m):
        print(matrix1[i][j] + matrix2[i][j], end=' ')
    print()