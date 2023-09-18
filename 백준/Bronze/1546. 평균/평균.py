count = int(input())
scores = list(map(int, input().split(" ")))
maxScore = max(scores)
result = 0
for i in scores:
    result += i/maxScore*100
print(result / count)