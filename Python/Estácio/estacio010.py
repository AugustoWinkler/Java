#Implementar uma solução para gerar 1000 pontos, seguindo a distribuição Normal com média em 20 e desvio-padrão 2
#exibir os dados em Histograma.

import matplotlib.pyplot as plt
import numpy as np

np.random.seed(1)
dados = np.random.normal(loc=20, scale=2, size=1000)
plt.hist(dados,color="lightblue", ec="red")
plt.show()
