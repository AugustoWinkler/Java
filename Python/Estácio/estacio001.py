#Faça um programa que leia a nota de um aluno, se for maior ou igual a 7 aprovado, menor que 7 ou igual a 5 recuperação
#menor que 5 reprovado

x = int(input('Qual a Nota?:'))

if x>=7:
    print('Você foi aprovado!')
elif x in range (5 , 7):
        print('Você está de recuperação')
else:
    print(' Você foi reprovado')
