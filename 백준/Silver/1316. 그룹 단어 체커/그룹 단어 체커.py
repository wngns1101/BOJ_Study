count = int(input())
result = count
for _ in range(count):
    word = input()
    for i in range(len(word)-1):
        if word[i] == word[i + 1]:
            continue
        if word[i] in word[i+1:]:
            result -= 1
            break
print(result)
