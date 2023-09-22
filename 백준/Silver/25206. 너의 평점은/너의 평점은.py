score = {'F':0.0, 'D0':1.0, 'D+':1.5, 'C0':2.0, 'C+':2.5, 'B0':3.0, 'B+':3.5, 'A0':4.0, 'A+':4.5}
result = 0
sumScore = 0
for _ in range(20):
    row = list(input().split(" "))
    if row[2] == 'P':
        continue
    else:
        getScore = score.get(row[2])
        result += float(row[1]) * getScore
        sumScore += float(row[1])
if result == 0:
    print('%.6f' % 0)
else:
    print('%.6f' % (result / sumScore))
