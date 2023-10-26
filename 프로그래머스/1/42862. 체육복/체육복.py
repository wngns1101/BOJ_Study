def solution(n, lost, reserve):
    answer = n
    
    lost.sort()
    reserve.sort()
    
    for i in lost[:]:
        if i in reserve:
            lost.remove(i)
            reserve.remove(i)
    
    for i in reserve: 
        min = i-1
        max = i+1
        if min in lost:
            lost.remove(min)
        elif max in lost:
            lost.remove(max)
    
    return answer - len(lost)    
