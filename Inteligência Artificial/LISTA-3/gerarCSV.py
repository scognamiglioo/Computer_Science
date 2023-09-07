import csv

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

columns = ["História do Crédito", "Dívida", "Garantias", "Renda Anual", "Risco"]

# Nome do arquivo CSV
filename = "dados.csv"

# Abre o arquivo CSV em modo de escrita
with open(filename, 'w', newline='') as csvfile:
    # Cria um objeto writer CSV
    csvwriter = csv.writer(csvfile)
    
    # Escreve o cabeçalho (nomes das colunas)
    csvwriter.writerow(columns)
    
    # Escreve os dados
    csvwriter.writerows(data)

print(f'Arquivo CSV "{filename}" gerado com sucesso!')
