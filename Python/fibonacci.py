n = int(input())
fibo_list = [0]
current_value = 1
for i in range(n-1):
    
    current_value = fibo_list[i-1] + current_value
    fibo_list.append(current_value)

for i in range(len(fibo_list)):
    print(fibo_list[i], end="" if i == len(fibo_list) - 1 else " ")
    
print()