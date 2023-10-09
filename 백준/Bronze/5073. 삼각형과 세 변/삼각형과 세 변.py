while True:
    lens = list(map(int, input().split()))
    if sum(lens) == 0:
        break
    tempLens = lens.copy()
    maxValue = max(tempLens)
    tempLens.remove(maxValue)
    if lens.count(lens[0]) == 3:
        print("Equilateral")
    elif maxValue >= sum(tempLens):
        print("Invalid")
    elif len(set(lens)) == 2:
        print("Isosceles")
    elif len(set(lens)) == 3:
        print("Scalene")


