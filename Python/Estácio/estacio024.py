compras = [["Arroz",6] , ["Feijão", 5,1], ["Carne",50,2]] #Cria uma Matriz
print(compras) #Exibe a Matriz
compras.append(["Cebola",5,1])  #Adiciona o Array para o final da Matriz
print(compras)
compras[0].append(2)  #Adiciona o valor 2 no Array de Indice 0 da Matriz
print(compras)
compras.remove(["Feijão",5,1]) #Remove o Array que contenha esses elementos no caso Indice 1
print(compras)
compras.pop(2) #Remove o Array de Indice 2
print(compras)