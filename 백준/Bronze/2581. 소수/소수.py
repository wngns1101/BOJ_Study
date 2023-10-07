num1 = int(input())
num2 = int(input())
nums = []

for i in range(num1, num2+1):
    sosu = 0
    if i > 1:
        for j in range(2, i):
            if i % j == 0:
                sosu += 1
        if sosu == 0:
            nums.append(i)
if len(nums) == 0:
    print(-1)
else:
    print(sum(nums))
    print(min(nums))
