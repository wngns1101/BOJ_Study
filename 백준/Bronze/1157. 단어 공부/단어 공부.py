str = input().upper()
dict = {}
result = []

for i in str:
    if i in dict:
        dict[f'{i}'] += 1
    else:
        dict[f'{i}'] = 1

maxValue = max(dict.values())

for key, value in dict.items():
    if maxValue == value:
        result.append(key)

if len(result) == 1:
    print(result[0])
else:
    print('?')