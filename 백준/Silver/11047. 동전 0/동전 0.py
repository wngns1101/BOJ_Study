# 동전의 종류 n과 계산할 액수인 k를 입력 받는다
n, k = map(int, input().split(" "))

# 코인의 종류를 입력 받을 배열 coin을 선언한다
coin = []

# 사용된 코인의 개수를 저장할 count 변수를 초기화한다
count = 0

# 동전의 종류의 개수만큼 입력 받은 변수인 price를 coin 배열에 추가한다
for x in range(n):
    price = int(input())
    coin.append(price)

# 역방향으로 정렬한다(for 구문을 쓸 때 x를 편하게 쓰기 위해서)
coin.sort(reverse=True)

for x in coin:
        count += k // x
        k = k % x

# 사용된 동전의 개수를 출력한다
print(count)