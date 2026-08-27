close = 0
nota_media = 0
while True:
    nota = float(input())
    if nota < 0 or nota> 10:
        print("nota invalida")
    else:
        nota_media += nota
        close += 1
        if close == 2:
            print(f"media = {nota_media/2:.2f}")
            print("novo calculo (1-sim 2-nao)")
            keep = int(input())
            if keep == 1:
                close = 0
                nota_media = 0
            elif keep == 2:   
                break
            else:
                while keep != 1 and keep != 2:
                    print("novo calculo (1-sim 2-nao)")
                    keep = int(input())
                    if keep == 1:
                        close = 0
                        nota_media = 0
                    elif keep == 2:   
                        break
            
            