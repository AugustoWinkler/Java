#Implementar uma solução em Python que retorne a soma de todos os elementos impares de uma lista.

def ehPar(n):
    r = (n%2==0)
    return r

def somar_par(lst):
    soma=0
    for num in lst:
        if(ehPar(num)):
            soma=soma+num
    return soma

lista= [ 10 , 2 , 5 , 7 , 6 , 3 ]

soma = somar_par(lista)
print(f'O Somatório dos números par é: [{soma}]')
