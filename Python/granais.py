inter = 0
gremio = 0
draw = 0
grenais_total = 1

while True:
    i,g = map(int,input().split())
    
    if i > g:
        inter += 1
    elif g > i:
        gremio += 1
    else:
        draw += 1
    
    print("Novo grenal (1-sim 2-nao)")
    keep_run = int(input())
    if keep_run == 1:
        grenais_total +=1
        keep_run = 0
    else:
        print(f"{grenais_total} grenais")
        print(f"Inter:{inter}")
        print(f"Gremio:{gremio}")
        print(f"Empates:{draw}")
        
        if inter > gremio:
            print("Inter venceu mais")
        else:
            print("Gremio venceu mais")
        
        break