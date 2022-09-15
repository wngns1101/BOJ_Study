# a = input()
# greedy = []
# count = 0
# result = 0
# sum1 = 0
# sum2 = 0
# for x in range(len(a)):
#     if a[x] == "-":
#         greedy.append(int(a[count:x]))
#         count = x+1
#         greedy.append("-")
#     elif a[x] == "+":
#         greedy.append(int(a[count:x]))
#         count = x+1
#         greedy.append("+")
#     else:
#         continue
# greedy.append(int(a[count:]))
#
# for x in range(1, len(greedy)):
#     if greedy[x] == '-':
#         for y in range(0, x):
#             sum1 += greedy[y]
#         for z in range(x, len(greedy)):
#             sum2 += greedy[z]
#         print(sum1)
#         print(sum2)
#         result = sum1 - sum2
#
# # [55, '-', 50, '+', 40]
#
# print(result)

a = input().split("-")
sum = 0
for x in a[0].split("+"):
    sum += int(x)
for x in a[1:]:
    for y in x.split("+"):
        sum -= int(y)
print(sum)