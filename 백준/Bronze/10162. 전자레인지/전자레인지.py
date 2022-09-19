n = int(input())
div = n
time = [300, 60, 10]
count = []

for i in range(len(time)):
    if(time[i] <= n):
        count.append(n // time[i])
        n = n % time[i]
    else:
        count.append(0)


if(div % 10 != 0):
    print(-1)
else:
    print(count[0], count[1], count[2])