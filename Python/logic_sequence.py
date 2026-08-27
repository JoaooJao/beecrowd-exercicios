#n = int(input())
#
#
#for i in range(1,n+1):
#    print(f"{i} {i**2} {i**3}")
#    print(f"{i} {i**2+1} {i**3+1}")
#

## Logic Sequence 2 ##


#x, y = map(int, input().split())
#
#for i in range(1, y + 1):
#    if i % x == 0:
#        print(i)
#    else:
#        print(i, end=" ")





## Crescent Logic Sequence ##

#while True:
#    x = int(input())
#    if x == 0:
#        break
#    else:
#        for i in range(1,x+1):
#            print(i, end="" if i == x else " ")
#            i+= 1
#        print()


# Logic Sequence 4 ##

A,N = map(int, input().split())

matriz = []
soma = 0

while N < 0:
    N = int(input())
for i in range(1,N+1):
    matriz.append(A)
    
for i in range(0, len(matriz)):
    soma += matriz[i]
    soma += i
print(soma)
