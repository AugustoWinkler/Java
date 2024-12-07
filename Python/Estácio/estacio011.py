#implementar uma solução que faça o tratamento de exceção para verificar se a entrada é um numero

try:
    x = int(input('Digite um número: '))
except ValueError:
    print('Entre com um número válido.')
