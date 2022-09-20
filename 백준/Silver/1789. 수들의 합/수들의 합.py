n = int(input())

i = 1
sum = 0

while True:
    n -= i
    i = i + 1
    if(n < 0):
        i = i - 2
        break

print(i)