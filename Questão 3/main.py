import json

def calcular_faturamento(faturamento):
    faturamento_valido = [f['valor'] for f in faturamento if f['valor'] > 0]

    menor_faturamento = min(faturamento_valido)
    maior_faturamento = max(faturamento_valido)

    media_faturamento = sum(faturamento_valido) / len(faturamento_valido)

    dias_acima_da_media = sum(1 for f in faturamento_valido if f > media_faturamento)

    return menor_faturamento, maior_faturamento, dias_acima_da_media


with open('dados.json', 'r') as file:
    faturamento = json.load(file)

menor, maior, dias_acima_media = calcular_faturamento(faturamento)

print(f"Menor valor de faturamento: R$ {menor:.2f}")
print(f"Maior valor de faturamento: R$ {maior:.2f}")
print(f"Dias com faturamento acima da média: {dias_acima_media}")