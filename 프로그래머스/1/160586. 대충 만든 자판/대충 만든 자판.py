def solution(keymap, targets):
    answer = []
    for target in targets:
        result = 0
        for w in target:
            time = 101
            flag = False
            for k in keymap:
                if w in k:
                    time = min(k.index(w)+1, time)
                    flag = True
            if not flag:
                result = -1
                break
            result += time
        answer.append(result)

    return answer