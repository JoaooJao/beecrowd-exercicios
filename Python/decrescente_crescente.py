while True:
    x,y = map(int, input().split())
    if x > y:
        print(f"Decrescente")
    elif x == y:
        break
    else:
        print(f"Crescente")