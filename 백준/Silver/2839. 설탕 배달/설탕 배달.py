# 설탕의 무게인 n을 입력
n = int(input())
# 사용한 봉지의 횟수인 count를 초기화
count = 0

# n이 0이 아닐 때 반복
while n != 0:
# 만약 n이 음수로 떨어진다면 봉지로 정확하게 나눌 수 없으므로 봉지 횟수를 -1로 만들고 반복문 끝
    if(n < 0):
        count = -1
        break
# n이 5로 나누어지면 count에 몫을 넣고 5로 나눈 나머지를 n으로 교체
    if(n % 5 == 0):
        count += n // 5
        n = n % 5
# 만약 5로 안 나누어진다면 3kg을 빼고 봉지 count를 1 증가
    else:
        n = n - 3
        count += 1

# 봉지 횟수 출력
print(count)