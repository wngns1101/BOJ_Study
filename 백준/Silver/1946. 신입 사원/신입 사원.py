n = int(input())

for _ in range(n):
    count = int(input())
    data = [list(map(int, input().split())) for _ in range(count)]
    data.sort()
    max = 1
    m = data[0]
    for i in range(1, len(data)):
        k = data[i]
        if m[0] > k[0] or m[1] > k[1]:
            max += 1
            m = data[i]
    print(max)