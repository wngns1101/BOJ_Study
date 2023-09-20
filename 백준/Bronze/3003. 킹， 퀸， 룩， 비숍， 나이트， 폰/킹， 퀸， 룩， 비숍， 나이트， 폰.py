pieces = [1, 1, 2, 2, 2, 8]
board = list(map(int, input().split(" ")))
result = ""
for index, piece in enumerate(pieces):
    if piece == board[index]:
        result += "0 "
    else:
        if board[index] > piece:
            result += str(-1*(board[index] - piece)) + " "
        else:
            result += str(piece - board[index]) + " "
print(result.strip())