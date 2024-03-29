while True:
    sentense = input()
    if sentense == ".":
        break
    stack = []
    answer = "yes"
    for w in sentense:
        if w == "(" or w == "[":
            stack.append(w)
        elif w == ")":
            if len(stack) != 0 and stack[-1] == "(":
                stack.pop()
            else:
                stack.append(w)
        elif w == "]":
            if len(stack) != 0 and stack[-1] == "[":
                stack.pop()
            else:
                stack.append(w)
    if len(stack) == 0:
        print("yes")
    else:
        print("no")