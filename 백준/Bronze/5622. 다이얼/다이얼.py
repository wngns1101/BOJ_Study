dial = ['','ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
word = input()
result = 0
for w in word:
    for index, letter in enumerate(dial):
        if w in letter:
            result += index + 2
print(result)