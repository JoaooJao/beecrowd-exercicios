test_cases = int(input())
for i in range(test_cases):
    population_a, population_b, city_grow_a, city_grow_b= map(float,input().split())
    population_a, population_b = int(population_a),int(population_b)
    year_count = 0
    while population_a <= population_b :
        
        population_a += int(population_a * city_grow_a / 100)
        population_b += int(population_b *city_grow_b / 100)
        year_count += 1
        
        if year_count > 100:
            print(f"Mais de 1 seculo.")
            break
    if year_count <= 100:
        print(f"{year_count} anos.")