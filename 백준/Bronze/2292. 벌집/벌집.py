count = 0
roomNo = 1
room = int(input())
while True:
    if roomNo + 6 * count >= room:
        count += 1
        break
    roomNo = roomNo + 6 * count
    count += 1
print(count)
