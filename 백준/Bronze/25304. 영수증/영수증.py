total = int(input())
cycle = int(input())
for i in range(cycle):
    price, count = map(int, input().split(" "))
    total -= price * count
if(total == 0):
    print('Yes')
else:
    print('No')