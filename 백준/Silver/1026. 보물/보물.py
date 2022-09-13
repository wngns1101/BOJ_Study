# 입력 받을 n개의 수 입력
n = int(input())

# 합을 저장할 변수 sum 초기화
sum = 0

# a의 수들을 띄어쓰기로 구분하고 타입은 int로 a에 리스트 방식으로 입력
a = list(map(int, input().split(" ")))
# b의 수들을 띄어쓰기로 구분하고 타입은 int로 a에 리스트 방식으로 입력
b = list(map(int, input().split(" ")))

# a의 수들을 내림차순으로 정렬
a.sort(reverse=True)
# b의 수들을 오름차순으로 정렬
b.sort()

# 입력받은 0부터 n까지 배열의 각각 자리수끼리 곱하고 sum 변수에 더하는 것을 반복
for i in range(n):
    sum += a[i] * b[i]

# 합 출력
print(sum)