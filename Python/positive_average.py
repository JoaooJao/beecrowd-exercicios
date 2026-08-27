n1 = float(input())
n2 = float(input())
n3 = float(input())
n4 = float(input())
n5 = float(input())
n6 = float(input())
positive_numbers = 0
lista = [n1,n2,n3,n4,n5,n6]
average = 0
for i in lista:
    if i > 0:
        positive_numbers += 1
        average += i
print(f"{positive_numbers} valores positivos")
print(f"{average/positive_numbers:.1f}")


