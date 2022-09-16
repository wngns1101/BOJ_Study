# 동전의 단위를 저장할 배열 coin 선언
coin = [500, 100, 50, 10, 5, 1]

# 지불할 금액인 totalPrice를 선언
totalPrice = 1000

# 구매할 물건의 가격을 입력
stuffPrice = int(input())

# 동전을 셀 변수인 count 선언
count = 0

# 잔돈의 액수를 저장할 changePrice 선언 후 지불 금액에서 물건 가격을 빼고 잔돈을 표현한 변수 changePrice에 저장
changePrice = totalPrice - stuffPrice

# 반복문을 사용에 coin 배열에 있는 동전 하나하나를 i에 넣고 반복
for i in coin:

# 만약 동전의 액수가 잔돈의 액수보다 작거나 같을 경우 잔돈을 동전으로 나눈 몫을 count 변수에 저장한 후 나머지를 changesPrice에 저장
    if i <= changePrice:
        count += changePrice // i
        changePrice = changePrice % i

# 동전의 갯수 출력
print(count)