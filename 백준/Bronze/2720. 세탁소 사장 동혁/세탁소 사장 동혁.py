coins = [25, 10, 5, 1]
result = []
count = int(input())
for i in range(count):
    num = int(input())
    coinCount = []
    for coin in coins:
        if num // coin > 0:
            coinCount.append(num // coin)
            num = num % coin
        else:
            coinCount.append(0)
    result.append(coinCount) 
for i in result:
    print(*i)