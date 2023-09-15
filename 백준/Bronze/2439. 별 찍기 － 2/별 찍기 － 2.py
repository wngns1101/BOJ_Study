count = int(input())

for i in range(1, count + 1):
    result = ''
    for j in range(count-i):
        result += ' '
    for k in range(i):
        result += '*'
    print(result)
