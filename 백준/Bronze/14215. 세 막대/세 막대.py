nums = sorted(list(map(int, input().split())))

if max(nums) >= nums[0] + nums[1]:
    print(nums[0] + nums[1] + (nums[0] + nums[1] - 1))
else:
    print(sum(nums))
