angles = []
for _ in range(3):
    angles.append(int(input()))

if (angles.count(60) == 3):
    print("Equilateral")
elif (sum(angles) == 180 and len(set(angles)) == 2):
    print("Isosceles")
elif (sum(angles) == 180 and len(set(angles)) == 3):
    print("Scalene")
else:
    print("Error")