import numpy as np

numeros = np.array([[4,13,16],[5,7,1],[8,10,15]])
print(numeros)
minimo = numeros.min()
maximo = numeros.max()
soma = numeros.sum()
media = numeros.mean()
desvio = numeros.std()
print("Minimo = ", minimo)
print("Maximo = " , maximo)
print("Soma = ", soma)
print("Media = ", media)
print("Desvio = ", desvio)
