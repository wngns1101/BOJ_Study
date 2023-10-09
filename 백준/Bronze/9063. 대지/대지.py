count = int(input())
xCoordinate = []
yCoordinate = []
for _ in range(count):
    x, y = map(int, input().split())
    xCoordinate.append(x)
    yCoordinate.append(y)
print((max(xCoordinate) - min(xCoordinate)) * (max(yCoordinate) - min(yCoordinate)))