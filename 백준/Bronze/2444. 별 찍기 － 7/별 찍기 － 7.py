count = int(input())

for i in range(1, count + 1):
    print(" " * (count - i) + "*" * (2 * i - 1))

for i in range(count - 1, 0, -1):
    print(" " * (count - i) + "*" * (2 * i - 1))