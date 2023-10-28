n = int(input())
points = []
for _ in range(n):
    points.append(list(map(int, input().split(" "))))
points.sort(key=lambda x: (x[0], x[1]))
for x, y in points:
    print(x, y)