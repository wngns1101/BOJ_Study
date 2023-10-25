from collections import deque
def solution(arr):
    answer = []
    queue = deque()
    queue.append(arr[0])
    for i in range(1, len(arr)):
        temp = queue.pop()
        if temp == arr[i]:
            queue.append(temp)
        else:
            queue.append(temp)
            queue.append(arr[i])
    for i in queue:
        answer.append(i)
    return answer


print(solution([1,1,3,3,0,1,1]))