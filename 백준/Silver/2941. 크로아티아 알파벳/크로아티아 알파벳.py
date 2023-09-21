croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
str = input()
count = 0
for i in croatia:
    if i in str:
        str = str.replace(i, ',')
count += str.count(',')

print(count + len(str)-str.count(','))