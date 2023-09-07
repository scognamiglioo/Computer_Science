import pandas as pd
from sklearn.tree import DecisionTreeClassifier
from sklearn.preprocessing import LabelEncoder
from sklearn.tree import export_text

# Dados fornecidos
data = [
    ["Ruim", "Alta", "Nenhuma", "<15000", "Alto"],
    ["Desconhecida", "Alta", "Nenhuma", ">=15000 a <=35000", "Alto"],
    ["Desconhecida", "Baixa", "Nenhuma", ">=15000 a <=35000", "Moderado"],
    ["Desconhecida", "Baixa", "Nenhuma", ">35000", "Alto"],
    ["Desconhecida", "Baixa", "Nenhuma", ">35000", "Baixo"],
    ["Desconhecida", "Baixa", "Adequada", ">35000", "Baixo"],
    ["Ruim", "Baixa", "Nenhuma", "<15000", "Alto"],
    ["Ruim", "Baixa", "Adequada", ">35000", "Moderado"],
    ["Boa", "Baixa", "Nenhuma", ">35000", "Baixo"],
    ["Boa", "Alta", "Adequada", ">35000", "Baixo"],
    ["Boa", "Alta", "Nenhuma", "<15000", "Alto"],
    ["Boa", "Alta", "Nenhuma", ">=15000 a <=35000", "Moderado"],
    ["Boa", "Alta", "Nenhuma", ">35000", "Baixo"],
    ["Ruim", "Alta", "Nenhuma", ">=15000 a <=35000", "Alto"]
]

# Colunas
columns = ["História do Crédito", "Dívida", "Garantias", "Renda Anual", "Risco"]

# Converter os dados em um DataFrame
df = pd.DataFrame(data, columns=columns)

# Codificar os atributos categóricos em números inteiros
label_encoders = {}
for column in df.columns:
    le = LabelEncoder()
    df[column] = le.fit_transform(df[column])
    label_encoders[column] = le

# Separar atributos e rótulos
X = df.iloc[:, :-1].values
y = df.iloc[:, -1].values

# Construir a árvore de decisão CART
clf = DecisionTreeClassifier(criterion="gini")
clf.fit(X, y)

# Exibir a árvore de decisão como texto
tree_text = export_text(clf, feature_names=columns[:-1])
print(tree_text)
