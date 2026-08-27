salary = float(input())

if salary <= 400:
    rate = 0.15
    new_salary = salary * rate

if salary >=400.01 and salary <=800.00:
    rate = 0.12
    new_salary = salary * rate

if salary  >= 800.01 and salary <= 1200.00:
    rate = 0.10
    new_salary = salary * rate

if salary >=1200.01 and salary <= 2000.00:
    rate = 0.07
    new_salary = salary * rate
    
if salary >=2000.01:
    rate = 0.04
    new_salary = salary * rate


print(f"Novo salario: {salary + new_salary:.2f}")
print(f"Reajuste ganho: {new_salary:.2f}")
print(f"Em percentual: {rate * 100:.0f} %")

# 2° Solução

salary = float(input())

if salary <= 400.00:
    rate = 0.15
elif salary <= 800.00:
    rate = 0.12
elif salary <= 1200.00:
    rate = 0.10
elif salary <= 2000.00:
    rate = 0.07
else:
    rate = 0.04

increase = salary * rate
new_salary = salary + increase

print(f"Novo salario: {new_salary:.2f}")
print(f"Reajuste ganho: {increase:.2f}")
print(f"Em percentual: {rate * 100:.0f} %")