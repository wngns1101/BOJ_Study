def solution(nums):
    dict = {}
    for i in nums:
        dict[i] = i
    answer = len(dict)
    if len(nums)/2 == answer:
        return answer
    elif len(nums)/2 < answer:
        return int(len(nums)/2)
    return answer