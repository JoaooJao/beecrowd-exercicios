contador = 0
soma = 0

while True:
    x = int(input())
    soma = 0
    contador = 0
    if x == 0 : 
        break
    
    while  contador != 5:
        if x % 2 ==0 :
            soma += x
            contador +=1
            x += 1
        else:
            x += 1
    print(soma)
        