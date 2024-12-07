class Conta:
    def __init__(self, numero, cpf, nomeTitular, saldo):
        self.numero = numero
        self.cpf = cpf
        self.nomeTitular = nomeTitular
        self.saldo = saldo

    def depositar(self, valor):
        self.saldo += valor

    def sacar(self, valor):
        self.saldo -= valor

    def gerar_extrato(self):
        print(f"numero: {self.numero} \n cpf: {self.cpf}\nsaldo: {self.saldo}")


def main():
    c1 = Conta(1, 1, "Joao", 0)
    c1.depositar(300)
    c1.sacar(100)
    c1.gerar_extrato()


if __name__ == "__main__":
    main()