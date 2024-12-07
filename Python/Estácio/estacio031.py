nomes= ['Joao','Maria','Ana','Arthur']

def removeL(k, L, n):
    i = 0
    posRemocao = -1

    # Encontrar a posição de remoção
    while i < n:
        if L[i] == k:
            posRemocao = i
            break  # Saia do loop quando encontrar a posição de remoção
        i += 1

    # Se a posição de remoção não for encontrada, retorne -1
    if i == n:
        return -1

    # Deslocar os elementos para preencher a posição de remoção
    while i < n - 1:
        L[i] = L[i + 1]
        i += 1

    # Remover o último elemento
    L.pop()

    return posRemocao
elementos = len(nomes)
print(removeL('Arthur',nomes,elementos))
print(nomes)
