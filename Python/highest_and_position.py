highest = int(0)
position = int(0)
for i in range(100):
    n = int(input())
    if n > highest:
        highest = n
        position = i + 1
print(f"{highest}")
print(f"{position}")