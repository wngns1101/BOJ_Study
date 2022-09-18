n = int(input())

rope = []
weight = []

for i in range(n):
    rope.append(int(input()))

rope.sort(reverse=True)

for i in range(len(rope)):
    mul = rope[i] * (i+1)
    weight.append(mul)

maxWeight = max(weight)

print(maxWeight)