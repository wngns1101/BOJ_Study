n = int(input())
nums = list(map(int, input().split(" ")))
target = 1
stack = []
while nums:
    if target == nums[0]:
        nums.pop(0)
        target += 1
    else:
        stack.append(nums.pop(0))

    while stack:
        if stack[-1] == target:
            stack.pop()
            target += 1
        else:
            break
if not stack:
    print("Nice")
else:
    print("Sad")