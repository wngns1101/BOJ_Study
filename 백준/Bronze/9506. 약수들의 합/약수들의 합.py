while True:
    nums = []
    n = int(input())
    if n == -1:
        break
    for i in range(1, n):
        if n % i == 0:
            nums.append(i)
    if n == sum(nums):
        line = str(n) + ' = ' + str(nums[0])
        for j in range(1, len(nums)):
            line += ' + ' + str(nums[j])
        print(line)
    else:
        print(str(n) + ' is NOT perfect.')

