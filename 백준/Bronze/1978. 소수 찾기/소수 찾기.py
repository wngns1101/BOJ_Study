count = int(input())
nums = list(map(int, input().split()))
sosu = 0

for i in range(count):
    result = 0
    if nums[i] > 1:
        for j in range(2, nums[i]):
            if nums[i] % j == 0:
                result += 1
        if result == 0:
            sosu += 1

print(sosu)
