#Implementar uma solução em python  que resolva a seguinte questão:
#Calcular o valor de uma compra, sendo que o preço unitário é 10 Reais
#Se for feito uma compra em até 10 unidades não há descontos
#Para compras entre 11 e 20 unidades é dado um desconto de 10%
#acima de 20 Unidades é dado um desconto de 20%

x = float(input('Qual o valor da compra?:'))

unidade = x//10

if unidade>=20:
    print(f"""Você recebeu um desconto de 20% , por ter comprado :{unidade:.0f} Unidades
    O Valor de compra de {x} vai para {x - (x*20/100)}""" )
elif unidade>=11:
    print(f"""Você recebeu um desconto de 10% ,  por ter comprado: {unidade:.0f} Unidades
    O Valor de compra de {x} vai para {x - (x*10/100)}""")
else:
    print('Você não teve descontos em sua compra.')