xCoordinates = []
yCoordinates = []
for _ in range(3):
    x, y = map(int, input().split())
    if x in xCoordinates:
        xCoordinates.remove(x)
    else:
        xCoordinates.append(x)
    if y in yCoordinates:
        yCoordinates.remove(y)
    else:
        yCoordinates.append(y)

print(xCoordinates[0], yCoordinates[0])