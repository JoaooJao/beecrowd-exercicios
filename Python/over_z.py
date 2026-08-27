x = int(input())
z = int(input())

while z <= x :
    z = int (input())
    

soma = 0
contador = 0
for i in range(x,z):
    soma += i
    contador += 1
    if soma > z:
        break

print(soma)
print(contador)
