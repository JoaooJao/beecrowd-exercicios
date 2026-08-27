n = int(input())

n_anterior = n -1

for i in range(n_anterior,0,-1):
    n *= i

print(n)