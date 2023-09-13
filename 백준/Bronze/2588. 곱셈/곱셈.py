firstNum = int(input())
secondNum = int(input())

print(firstNum * (secondNum % 10))
print(firstNum * ((secondNum % 100) // 10))
print(firstNum * (secondNum // 100))
print(firstNum * secondNum)