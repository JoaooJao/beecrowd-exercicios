n = int(input())
vetor = []
x = list(map(int, input().split()))
menor = x[0]
position = 0
for i in range(n):
    if menor > x[i]:
        menor = x[i]
        position = i
print(f"Menor valor: {menor}")
print(f"Posicao: {position}")