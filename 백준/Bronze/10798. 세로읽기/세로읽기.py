array = []
length = []
result = []

for i in range(5):
    str = list(input())
    array.append(str)
    length.append(len(array[i]))

for i in range(max(length)):
    result.append([])

for i in range(5):
    for j in range(len(array[i])):
        result[j].append(array[i][j])

for row in result:
    for word in row:
        print(word, end = '')