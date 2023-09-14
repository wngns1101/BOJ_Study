h, m = map(int, input().split(" "))
clock = int(input())

if m + clock >= 60:
    h = h + ((m + clock) // 60)
    m = (m + clock) % 60
else:
    m = m + clock
    
if h >= 24:
    h = h - 24

print(str(h) + ' ' + str(m))