n = int(input())

rabbit = int(0)
frog = int(0)
rat = int(0)

for i in range(n):
    amount = input().split()
    animal_type = amount[1]
    amount = int(amount[0])
    
    if animal_type == "C":
        rabbit += amount
    elif animal_type == "S":
        frog += amount
    elif animal_type == "R":
        rat += amount
        
    total_animals = rabbit + frog + rat
    
print(f"Total: {total_animals} cobaias")
print(f"Total de coelhos: {rabbit}")
print(f"Total de ratos: {rat}")
print(f"Total de sapos: {frog}")
print(f"Percentual de coelhos: {rabbit * 100 / total_animals:.2f} %")
print(f"Percentual de ratos: {rat * 100 / total_animals:.2f} %")
print(f"Percentual de sapos: {frog * 100 / total_animals:.2f} %")
