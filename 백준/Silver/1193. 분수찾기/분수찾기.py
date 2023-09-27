arr = 1
num = int(input())
count = 1

while arr < num:
    arr += count + 1
    count += 1

if count % 2 == 0:
    x = count
    y = 1
    for _ in range(arr - num):
        x -= 1
        y += 1
else:
    x = 1
    y = count
    for _ in range(arr - num):
        x += 1
        y -= 1

print(str(x) + '/' + str(y))