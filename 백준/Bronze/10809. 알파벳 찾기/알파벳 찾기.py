result = [-1 for i in range(26)]
alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
str = input()
for i in range(len(str)):
    if str[i] in alphabet:
        if result[alphabet.index(str[i])] == -1:
            result[alphabet.index(str[i])] = i
print(*result)