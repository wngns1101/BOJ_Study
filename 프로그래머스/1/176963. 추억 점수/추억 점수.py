def solution(name, yearning, photo):
    answer = []
    scoreDict = {}
    
    for i in range(len(name)):
        scoreDict[name[i]] = yearning[i]
        
    for p in photo:
        sum = 0
        for j in p:
            if j in scoreDict:
                sum += scoreDict[j]
        answer.append(sum)
        
    return answer