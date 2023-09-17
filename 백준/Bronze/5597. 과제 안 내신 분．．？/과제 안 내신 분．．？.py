submitStudent = []
for _ in range(28):
    submitStudent.append(int(input()))
for i in range(1, 31):
    if i not in submitStudent:
        print(i)