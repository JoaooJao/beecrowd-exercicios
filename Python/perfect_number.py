test_cases = int(input())
for i in range(test_cases):
    number = int(input())
    soma_divisores = 0
    i = 1
    while i < number :
        if number % i == 0:
            soma_divisores += i
            i += 1
        else:
            i += 1
    
    if soma_divisores == number:
        print(f"{number} eh perfeito")
    else:
        print(f"{number} nao eh perfeito")
        
