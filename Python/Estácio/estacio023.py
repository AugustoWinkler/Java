import numpy as np

nomes =np.array(["João","Maria","Ana"]) #Usando a Biblioteca Numpy criamos um Vetor/Array
copia = nomes.copy() #Criamos uma cópia do Array
copia[0] = "Nelson" #Alteramos o Elemento de indice 0
print(nomes) #Exibimos o Array nomes
print(copia) #Exibimos o Array copia

visao = nomes.view()
visao[0] = "Nelson"

print(nomes)
print(visao)

for indice,valor in enumerate(nomes):  
    print(indice,valor)