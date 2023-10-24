def solution(array, commands):
    answer = []
    for i in commands:
        sortArray = sorted(array[i[0]-1:i[1]])
        answer.append(sortArray[i[2]-1])
    return answer