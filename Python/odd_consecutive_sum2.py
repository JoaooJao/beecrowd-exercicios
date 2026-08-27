n = int(input())
soma = 0
consecutive = 0
for i in range(n):
    x,y = map(int,input().split())
    consecutive = 0
    soma = 0
    
    while consecutive < y:  
        if x % 2 == 1:
            soma += x
            x +=2
            consecutive += 1
        else:
            x +=1

    print(soma)
