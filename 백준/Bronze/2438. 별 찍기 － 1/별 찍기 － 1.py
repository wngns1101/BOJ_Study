count = int(input())

for i in range(1, count+1):
    result = ''
    for j in range(1, i+1):
        result += '*'
    print(result)  
      