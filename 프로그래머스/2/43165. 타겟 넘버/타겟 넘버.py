def solution(numbers, target):
    nodes = [0]
    count = 0
    
    for i in numbers:
        temp = []
        for j in nodes:
            temp.append(j-i)
            temp.append(j+i)
        nodes = temp

    for i in nodes:
        if i == target:
            count += 1
    return count