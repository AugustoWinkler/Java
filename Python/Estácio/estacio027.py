nomes = ['Joao','Maria','Ana']
i = nomes.index('Joao')
print(i) #Define a Lista e mostra o Index(Endereço) de 'Joao' no caso Index 0 primeiro elemento/nó

elementos = len(nomes)

def buscaLista(k,L,n):  #k = Chave L =  Lista n = Máximo de Elementos da Lista
    i=0
    indicel=-1
    while i<n:
        if L[i]==k:
            indicel=i
            i=n+1
        i=i+1
    return indicel  #Retorna -1 se ocorrer algum erro

print(buscaLista('Maria',nomes,elementos))