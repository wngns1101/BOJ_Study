N = int(input())
count = 0
result = 0
i = 0
while True:
    i += 1
    if '666' in str(i):
        count += 1
        if count == N:
            result = i
            break
print(result)