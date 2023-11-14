def solution(n, m, section):
    result = 0
    answer = []
    for i in range(n):
        answer.append(1)

    for i in section:
        answer[i - 1] = 0

    for index, value in enumerate(answer):
        if value == 0:
            if index+m > n:
                for i in range(index, n):
                    answer[i] = 1
                result += 1
            else:
                for i in range(index, index + m):
                     answer[i] = 1
                result += 1
    return result