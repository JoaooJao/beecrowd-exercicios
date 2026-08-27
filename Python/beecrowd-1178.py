value = float(input())
vetor = []
vetor.append(value)

for i in range(100):
    print(f"N{[i]} = {vetor[i]:.4f}")
    value /= 2
    vetor.append(value)