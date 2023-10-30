import sys
input = sys.stdin.readline
n = int(input())
stack = []
for _ in range(n):
    command = input()
    if len(command) > 2:
        command = list(map(int, command.split(" ")))
        stack.append(command[1])
    else:
        command = int(command)
        if command == 2:
            if not stack:
                print(-1)
            else:
                print(stack.pop())
        elif command == 3:
            print(len(stack))
        elif command == 4:
            if not stack:
                print(1)
            else:
                print(0)
        elif command == 5:
            if not stack:
                print(-1)
            else:
                print(stack[len(stack)-1])