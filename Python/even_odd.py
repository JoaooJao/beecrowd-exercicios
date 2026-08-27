n = int(input())

for i in range(n):
    x = int(input())
    if x == 0:
        print(f"NULL")
    elif x % 2 == 1 and x > 0:
        print(f"ODD POSITIVE")
    elif x % 2 == 1 and x < 0:
        print(f"ODD NEGATIVE")
    elif x % 2 == 0 and x > 0:
        print(f"EVEN POSITIVE")
    else:
        print(f"EVEN NEGATIVE")
        
