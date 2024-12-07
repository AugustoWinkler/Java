def insereFinal(self, novoNo):
    noAtual = self.cabeca
    if noAtual:  # caso a lista nao esteja vazia
        while noAtual.proximo:
            noAtual = noAtual.proximo  # busca o final da lista
            noAtual.proximo = novoNo

    else:  # caso a lista esteja vazia
        self.cabeca = novoNo


def insereInicio(self, novoNo):
    novoNo.proximo = self.cabeca
    self.cabeca = novoNo


