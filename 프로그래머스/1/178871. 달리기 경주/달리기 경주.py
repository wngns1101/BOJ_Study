def solution(players, callings):
    playerDict = {player: index for index, player in enumerate(players)}
    callDict = {index: player for index, player in enumerate(players)}
    
    for call in callings:
        callIndex = playerDict[call]
        upperIndex = callIndex-1
        
        upperCall = callDict[upperIndex]
        
        temp = callDict[callIndex]
        callDict[callIndex] = callDict[upperIndex]
        callDict[upperIndex] = temp
    
        playerDict[call] = upperIndex
        playerDict[upperCall] = callIndex
        
    result = []
    for i in callDict.values():
        result.append(i)
    
    return result