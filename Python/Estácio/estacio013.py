#Implementar uma solução que faça o tratamento de divisão por Zero:

def entrada_dados():
    numero = int(input('Digite um valor: '))
    return numero

a = entrada_dados()
b = entrada_dados()

def dividir(x , y):
    try:
        resultado = x / y
        print('A Respota é :', resultado)
    except ZeroDivisionError:
        print('Divisão por Zero ')

dividir(a , b)