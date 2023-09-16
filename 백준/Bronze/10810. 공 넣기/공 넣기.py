basket, putBalls = map(int, input().split(" "))
baskets = []
for i in range(basket):
    baskets.append(0)
for i in range(putBalls):
    firstBasket, lastBasket, basketNum = map(int, input().split(" "))
    for i in range(firstBasket-1, lastBasket):
        baskets[i] = basketNum
print(*baskets)
