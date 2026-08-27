# Lê a linha "Dia X"
# split() separa a string em ["Dia", "X"]
# pegamos o índice 1 para obter apenas o número do dia
start_day = int(input().split()[1])

# Lê o horário inicial no formato "hh : mm : ss"
# split(" : ") separa pelos dois pontos com espaço
# map(int, ...) transforma tudo em números
h1, m1, s1 = map(int, input().split(" : "))


# Lê o dia final da mesma forma
end_day = int(input().split()[1])

# Lê o horário final
h2, m2, s2 = map(int, input().split(" : "))


# Convertendo o tempo inicial totalmente para segundos
# 1 dia = 86400 segundos
# 1 hora = 3600 segundos
# 1 minuto = 60 segundos
inicio = start_day*86400 + h1*3600 + m1*60 + s1


# Convertendo o tempo final totalmente para segundos
fim = end_day*86400 + h2*3600 + m2*60 + s2


# Calcula a duração total em segundos
total = fim - inicio


# Convertendo os segundos novamente para dias
dias = total // 86400

# Atualiza o restante dos segundos depois de tirar os dias
total %= 86400


# Converte o restante para horas
horas = total // 3600

# Atualiza novamente o restante
total %= 3600


# Converte para minutos
minutos = total // 60

# O que sobrar são os segundos
segundos = total % 60


# Imprime no formato exigido pelo problema
print(f"{dias} dia(s)")
print(f"{horas} hora(s)")
print(f"{minutos} minuto(s)")
print(f"{segundos} segundo(s)")