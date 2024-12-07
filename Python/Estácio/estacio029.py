nomes = ['Joao','Maria','Ana']

def insereOrdenada(k, L, n):
    i = 0
    posinsercao = -1

    # Encontrar a posição de inserção
    while i < n:
        if L[i] >= k:
            if L[i] == k:
                return -1  # Elemento já existe na lista
            else:
                posinsercao = i
                break
        i += 1
    else:
        posinsercao = n  # Se k for maior que todos os elementos na lista

    # Deslocar os elementos para abrir espaço para a inserção
    L.append(None)
    i = n
    while i > posinsercao:
        L[i] = L[i - 1]
        i -= 1

    # Inserir o elemento na posição correta
    L[posinsercao] = k
    return posinsercao


print(nomes)
elementos = len(nomes)
insereOrdenada('Arthur',nomes,elementos)
print(nomes)