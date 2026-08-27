filo = input().lower()
especie = input().lower()
alimentacao = input().lower()

if filo == "vertebrado":
    if especie == "ave":
        if alimentacao == "carnivoro":
            print("aguia")
        else:
            print("pomba")
            
    elif especie == "mamifero":
        if alimentacao == "onivoro":
            print("homem")
        else:
            print("vaca")
            
else:
    if especie == "inseto":
        if alimentacao == "hematofago":
            print("pulga")
        else:
            print("lagarta")
            
    elif especie == "anelideo":
        if alimentacao == "hematofago":
            print("sanguessuga")
        else:
            print("minhoca")
        
        
    