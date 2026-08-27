'''lisarb_values = float(input())

if lisarb_values > 0 and lisarb_values <=2000.00:
    print("Isento")

elif lisarb_values >= 2000.01 and lisarb_values <=3000.00:
    salary_tax = lisarb_values * 0.08
    print(f"R$ {salary_tax:.2f}")
    
elif lisarb_values >= 3000.01 and lisarb_values <=4500.00:
    salary_tax = lisarb_values * 0.18
    print(f"R$ {salary_tax:.2f}")

else:
    salary_tax = lisarb_values * 0.28
    print(f"R$ {salary_tax:}")'''
    
lisarb_salary = float(input())

# Calculo == 3002 - 2000.00 (isento)
# 3000 - 2000 = 1000 * 0.08 == 80
# 2 reais entra na taxa de 18% == 2 * 0.18 == 0.36
# Total é igual a R$80.36.

lisarb_taxes = (lisarb_salary - 2000) 

if lisarb_salary > 0 and lisarb_salary <= 2000.00:
    print("Isento")

elif lisarb_salary >= 2000.01 and lisarb_salary <=3000.00:
    lisarb_taxes = lisarb_taxes * 0.08 
    print(f"R$ {lisarb_taxes:.2f}")

elif lisarb_salary >= 3000.01 and lisarb_salary <= 4500.00:
    lisarb_taxes = lisarb_taxes * 0.18 - 100
    print(f"R$ {lisarb_taxes:.2f}")
    
else:
    lisarb_taxes = lisarb_taxes * 0.28 - 350
    print(f"R$ {lisarb_taxes:.2f}")