odd_vetor = []
even_vetor = []

for i in range(15):
    value = int(input())
    
    if value % 2 == 0:
        even_vetor.append(value)
        if len(even_vetor) == 5:
            for i in range(len(even_vetor)):
                print(f"par[{i}] = {even_vetor[i]}")
            even_vetor = []
            
    else:
        odd_vetor.append(value)
        if len(odd_vetor) == 5:
            for item in range(len(odd_vetor)):
                print(f"impar[{item}] = {odd_vetor[item]}")
            odd_vetor = []
            
    if i == 14:
        for item in range(len(odd_vetor)):
            print(f"impar[{item}] = {odd_vetor[item]}")
        for i in range(len(even_vetor)):
            print(f"par[{i}] = {even_vetor[i]}")
