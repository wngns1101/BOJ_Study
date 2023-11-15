from collections import deque


def solution(cards1, cards2, goal):
    answer = 'Yes'
    card1Queue = deque(cards1)
    card2Queue = deque(cards2)

    for i in goal:
        if len(card1Queue) > 0 and card1Queue[0] == i:
            card1Queue.popleft()
        elif len(card2Queue) > 0 and card2Queue[0] == i:
            card2Queue.popleft()
        else:
            answer = 'No'
            break

    return answer