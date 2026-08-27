#READ A INTEGER AND PRINT ALL NUMBERS BETWEEN 1 AND 10000, WHERE DIVIDED I % N = 2.
n = int(input())
for i in range(1,10000):
    if i % n == 2:
        print(i)