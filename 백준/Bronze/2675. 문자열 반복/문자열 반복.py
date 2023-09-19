count = int(input())
for i in range(count):
    result = ''
    cycle, str = input().split(" ")
    for i in str:
        for j in range(int(cycle)):
            result += i
    print(result)
