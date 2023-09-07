# com base nos dados lidos em dados.csv faz o tratamento do arquivo para gerar a arvore de decisao

import csv
import math
import random
import sys
import os
import numpy as np
import pandas as pd
from sklearn import tree
from sklearn.preprocessing import OneHotEncoder
from sklearn.compose import ColumnTransformer
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split
from sklearn import preprocessing
from sklearn import metrics


# leitura do arquivo csv utiliza o pandas
base = pd.read_csv('dados.csv')

# imprime a base de dados
print(base)

base.head(3)
base.tail(3)

# imprime a quantidade de linhas e colunas
print(base.shape)

np.unique(base['Risco'], return_counts=True)


# associa as colunas a variável X
X_prev = base.iloc[:, 0:4].values

# imprime os valores de X
print(X_prev)

# array com os valores da coluna Risco
base['Risco'].values

# imprime os valores da coluna Risco
print(base['Risco'].value_counts())


# associa a ultima coluna com a variável y
y_classe = base.iloc[:, 4].values

# imprime os valores de y
print(y_classe)


# transformando (tratando) em dados categóricos
labelencoder = preprocessing.LabelEncoder()
label_enconder_Historia = labelencoder.fit_transform(X_prev[:,0])
label_enconder_Divida = labelencoder.fit_transform(X_prev[:,1])
label_enconder_Garantias = labelencoder.fit_transform(X_prev[:,2])
label_enconder_Renda = labelencoder.fit_transform(X_prev[:,3])




# imprime os valores de X_prev
print(X_prev)

# one hot encoder
onehotencoder = ColumnTransformer(transformers=[("OneHot", OneHotEncoder(), [0,1,2,3])], remainder='passthrough')
X_prev = onehotencoder.fit_transform(X_prev)

# imprime os valores de X_prev
print(X_prev)

# imprime os valores de y_classe

print(y_classe)

# divide a base de dados em treinamento e teste
X_train, X_test, y_train, y_test = train_test_split(X_prev, y_classe, test_size=0.3, random_state=1)

# imprime os valores de X_train
print(X_train)

# imprime os valores de X_test
print(X_test)

# imprime os valores de y_train
print(y_train)

# imprime os valores de y_test
print(y_test)

# gerar um mesmo arquivo pkl com os treinamentos
import pickle
pickle.dump(X_train, open('X_train.pkl', 'wb'))
pickle.dump(X_test, open('X_test.pkl', 'wb'))
pickle.dump(y_train, open('y_train.pkl', 'wb'))
pickle.dump(y_test, open('y_test.pkl', 'wb'))




# arvore de decisao
arvore = tree.DecisionTreeClassifier(criterion='entropy', random_state=0)
arvore = arvore.fit(X_train, y_train)


# faz a predicao
y_pred = arvore.predict(X_test)

# faz a predicao
y_pred = arvore.predict(X_test)


#salvar todos os printados em um arquivo txt

sys.stdout = open('arvore.txt', 'w')
#imprimir entopria da arvore
print(arvore.tree_.impurity)

#imprimir a importancia de cada variavel
print(arvore.feature_importances_)

# imprime os valores de y_pred
print(y_pred)
print("Acurácia: ", metrics.accuracy_score(y_test, y_pred))
print("Matriz de Confusão: ", metrics.confusion_matrix(y_test, y_pred))
print(metrics.classification_report(y_test, y_pred))
sys.stdout.close()




import matplotlib.pyplot as plt

# gerar representacao grafica da arvore de decisao com base nos dados de treinamento 
fig, ax = plt.subplots(figsize=(20, 20))
tree.plot_tree(arvore, fontsize=10)

#salvar a arvore em png
plt.savefig('arvore.png')



# gerar arquivo png de saida da arvore de decisao
fig.savefig("arvore.png")














