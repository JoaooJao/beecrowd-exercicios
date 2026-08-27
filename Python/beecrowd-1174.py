vetor = []
for i in range (5):
    valor = float(input())
    vetor.append(valor)
for i in range(len(vetor)):
    if vetor[i] <= 10:
        print(f"A[{i}] = {vetor[i]}")