def solution(answers):
    answer = []
    student1 = [1, 2, 3, 4, 5]
    student2 = [2, 1, 2, 3, 2, 4, 2, 5]
    student3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    studentCount = [0, 0, 0]

    for i in range(len(answers)):
        ans = answers[i]
        if student1[i%len(student1)] == ans:
            studentCount[0] += 1
        if student2[i%len(student2)] == ans:
            studentCount[1] += 1
        if student3[i%len(student3)] == ans:
            studentCount[2] += 1

    for i in range(len(studentCount)):
        if studentCount[i] == max(studentCount):
            answer.append(i + 1)

    return answer


print(solution([1,3,2,4,2]))