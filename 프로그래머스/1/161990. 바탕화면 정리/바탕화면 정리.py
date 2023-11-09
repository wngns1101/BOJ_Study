def solution(wallpaper):
    answer = []
    xCoordinate = []
    yCoordinate = []
    
    for yIndex, w in enumerate(wallpaper):
        for xIndex, i in enumerate(w):
            if i == "#":
                xCoordinate.append(yIndex)
                yCoordinate.append(xIndex)
                xCoordinate.append(yIndex+1)
                yCoordinate.append(xIndex+1)
                
    answer.append(min(xCoordinate))
    answer.append(min(yCoordinate))
    answer.append(max(xCoordinate))
    answer.append(max(yCoordinate))
            
    return answer