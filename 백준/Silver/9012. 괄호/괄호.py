n = int(input())
for _ in range(n):
    s = input()
    stack = []
    result = "YES"
    for i in s:
        if i == '(':
            stack.append(i)
        elif i == ')':
            if not stack:
                result = "NO"
            else:
                stack.pop()
    if not stack:
        print(result)
    else:
        print("NO")