t = int(input())
vetor = []
start = 0
for i in range(1000):
    vetor.append(start)
    start+=1
    if start == t:
        start=0
        
for item in range(len(vetor)):
    print(f"N[{item}] = {vetor[item]}")