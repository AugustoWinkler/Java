#Implementar uma solução que retorne o menor elemento de uma lista.

def encontrar_minimo(lista):
    minimo =  lista[0]
    for elem in lista:
     if(elem < minimo):
        minimo =  elem
    return minimo

lista_teste = [ 2 , 10 , 3 , 1 , 4 , 5 ]

menor = encontrar_minimo(lista_teste)

print(f'O Menor valor da lista é : [{menor}]')