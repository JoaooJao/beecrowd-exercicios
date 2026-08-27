while True:
    x,y = map(int,input().split())
    
    if x >= 1 and y >= 1:
        print("primeiro")
    
    elif  x <= -1 and y >= 1:
        print("segundo")
        
    elif x <= -1 and y <= -1:
        print("terceiro")
        
    elif x >= 1 and y <= -1:
        print("quarto")
        
    else:
        break