#Faça uma solução que verifique se o número inserido é válido e insista para que insira um valor válido


while True:
    try:
        x = int(input('Digite um valor: '))
        break
    except ValueError:
        print('O valor inserido é inválido. Tente novamente.')

print(f'Você digitou o valor {x}.')
