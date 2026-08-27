linhas = 6
colunas = 6
matriz = []
for i in range(linhas):
    linha = []
    for j in range(colunas):
        linha.append("X")
        if j == colunas / 2:
            linha.append("O")
    matriz.append(linha)
    
for i in range(linhas):
    for j in range(colunas):
        print(matriz[i][j], end=' ')
    print()

