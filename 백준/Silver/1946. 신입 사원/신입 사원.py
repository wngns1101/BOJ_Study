n = int(input())

for i in range(n):
    count = int(input())
    emp = list()
    max = 1
    for i in range(count):
        x = list(map(int, input().split()))
        emp.append(x)
    emp.sort()
    m = emp[0]
    for i in range(1, len(emp)):
        k = emp[i]
        if m[0] > k[0] or m[1] > k[1]:
            max += 1
            m = emp[i]
    print(max)