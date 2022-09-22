num = list(input())
num.sort(reverse=True)
i = len(num)

sum = list(map(int, num))
total = 0

for i in sum:
    total += i

if num[i-1] == '0' and total % 3 == 0:
    for i in range(len(num)):
        print(num[i], end='')
else:
    print(-1)