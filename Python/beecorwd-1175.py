vetor = []
for i in range(20):
    valor = int(input())
    vetor.append(valor)

vetor = vetor[::-1]
for i in range(len(vetor)):
    print(f"N[{i}] = {vetor[i]}")

