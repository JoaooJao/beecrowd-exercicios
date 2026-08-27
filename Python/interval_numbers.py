n = int(input())
in_interval, out_interval = int(0), int(0)

for i in range(n):
    x = int(input())
    if x >= 10 and x <= 20:
        in_interval += 1
        n -= 1
    else:
        out_interval += 1
        n -= 1
print(f"{in_interval} in")
print(f"{out_interval} out")