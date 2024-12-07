def __init__(self,chave,valor):
    self.chave = chave
    self.valor = valor
    self.proximo = None

class listaEncadeada:
    def __init__(self,cabeca=None):
        self.cabeca = cabeca
    def print(self):
        current = self.cabeca
        while current:
            print(current.valor)
            current = current.proximo
