import time

numeros = ""

tempoInicialProcesso = time.process_time()
for i in range(0, 2000000):
    numeros += "\n"+str(i)
tempoFinalProcesso = time.process_time()
tempoProcesso = tempoFinalProcesso - tempoInicialProcesso

print(numeros) #MOSTRANDO DE FORMA DIRETA
print("Tempo do Processo {} MILISEGUNDOS".format(tempoProcesso))