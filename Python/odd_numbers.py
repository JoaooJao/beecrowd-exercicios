start_number = int(input())
odd_number = 0

while True:
    if start_number % 2 == 1:
        print(start_number)
        start_number += 1
        odd_number +=1
        if odd_number == 6:
            break
    else:
        start_number += 1