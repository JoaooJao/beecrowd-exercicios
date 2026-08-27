soma = 0
loops = 0
while True:
    age = int(input())
    if age < 0:
        soma = soma/loops
        break
    else:
        soma += age
        loops += 1
print(f"{soma:.2f}")