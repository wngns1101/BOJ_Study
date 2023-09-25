num, base = map(int, input().split())
arr = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
result = ''

while num > 0:
    result += str(arr[num % base])
    num //= base

print(result[::-1])