N = int(input())
nums = []
for i in range(N):
    nums.append(int(input()))
print(*sorted(nums))