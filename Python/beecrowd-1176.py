n = int(input())
fibo_list = [0]
current_value = 1
for i in range(60):
    current_value = fibo_list[i-1] + current_value
    fibo_list.append(current_value)

for i in range(n):
    fibo_value = int(input())
    print(f"Fib({fibo_value}) = {fibo_list[fibo_value]}")