array = []
for i in range(9):
    array.append(list(map(int, input().split(" "))))
maxNum = max(map(max, array))
for i in range(9):
    for j in range(9):
        if array[i][j] == maxNum:
            print(maxNum)
            print(i+1, j+1)

