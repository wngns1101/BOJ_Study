basketCount, count = map(int, input().split(" "))
baskets = [i for i in range(1, basketCount+1)]
for _ in range(count):
    firstBasket, nextBasket = map(int, input().split(" "))
    temp = []
    for i in range(firstBasket-1, nextBasket):
        temp.append(baskets[i])
    for i in range(firstBasket-1, nextBasket):
        baskets[i] = temp.pop()
print(*baskets)