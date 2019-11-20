import time

numeros = []

tempoInicialProcesso = time.process_time()
for i in range(0, 2000000):
    numeros.append(i)
tempoFinalProcesso = time.process_time()
tempoProcesso = tempoFinalProcesso - tempoInicialProcesso

print(numeros) #MOSTRANDO DE FORMA DIRETA
print("Tempo do Processo {} MILISEGUNDOS".format(tempoProcesso))

# CODIGO PARA MOSTRAR PERCORRENDO O ARRAY
#tempoInicialAmostra = time.process_time()
#for i in range(0, len(numeros)):
#    print(numeros[i])
#tempoFinalAmostra = time.process_time()
#tempoAmostra = tempoFinalAmostra - tempoInicialAmostra
#print("Tempo do Amostra {}".format(tempoAmostra))
