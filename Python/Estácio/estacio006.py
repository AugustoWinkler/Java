#implementar uma função que calcule o fatorial de um número

def calcular_fatorial(x):
    fatorial = 1
    for i in range(1, x+1):
        fatorial *= i
    return fatorial

x = int(input('Digite um número: '))
valor = calcular_fatorial(x)
print(valor)