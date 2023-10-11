n = int(input())
result = 0
for i in range(1, n):
    total = i + sum(map(int, str(i)))
    if total == n:
        result = i
        break
print(result)
