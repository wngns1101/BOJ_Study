def solution(participant, completion):
    participantCount = {}
    for i in participant:
        if i in participantCount:
            participantCount[i] += 1
        else:
            participantCount[i] = 1
    for i in completion:
        if i in participantCount:
            participantCount[i] -= 1

    for key, value in participantCount.items():
        if value != 0:
            return key