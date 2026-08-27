n1 = int(input())
n2 = int(input())
n3 = int(input())
n4 = int(input())
n5 = int(input())
lista = [n1,n2,n3,n4,n5]

even_numbers = 0
odd_numbers = 0

positive_numbers = 0 
negative_numbers = 0


for i in lista:
    
    # Pares e Ímpares
    if i % 2 == 0:
        even_numbers += 1
    else:
        odd_numbers += 1
    
    #Chegagem de Positivos e Negativos
    if i > 0 and i != 0:
        positive_numbers += 1
    elif i < 0 and i != 0:
        negative_numbers += 1
        
print(f"{even_numbers} valor(es) par(es)")
print(f"{odd_numbers} valor(es) impar(es)")
print(f"{positive_numbers} valor(es) positivo(s)")
print(f"{negative_numbers} valor(es) negativo(s)")