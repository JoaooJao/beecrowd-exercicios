test_cases = int(input())
for i in range(test_cases):
    number = int(input())
    soma_divisores = 0
    i = 1
    while i < number +1:
        if number % i == 0:
            soma_divisores += i
            i += 1
        else:
            i += 1
    
    if soma_divisores == number + 1:
        print(f"{number} eh primo")
    else:
        print(f"{number} nao eh primo")
        
