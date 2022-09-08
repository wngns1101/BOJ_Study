n = int(input())
p_list = list(map(int, input().split()))
p_list.sort()

sum = 0
result = 0

for x in p_list:
    sum += x
    result += sum

print(result)