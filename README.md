# Teste de Estagio Target Sistemas

Técnica:

<strong><code>1)</code></strong> Observe o trecho de código abaixo:
```
  int INDICE = 13, SOMA = 0, K = 0;
  Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
  Imprimir(SOMA);
```
  Ao final do processamento, qual será o valor da variável SOMA?  <strong><code>Resposta = 91</code></strong>

[Implementação](https://github.com/King-Klauz/Teste-de-Estagio-Target-Sistemas/blob/6dbf5db5c8a97602782417341b085833eed64054/Quest%C3%B5es%201%2C%202%2C%204%20e%205/src/respostas/Incrementar.java)



<strong><code>2)</code></strong> Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
   
IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

  [Implementação](https://github.com/King-Klauz/Teste-de-Estagio-Target-Sistemas/blob/main/Quest%C3%B5es%201%2C%202%2C%204%20e%205/src/respostas/Fibonacci.java)

 

<strong><code>3)</code></strong> Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
- O menor valor de faturamento ocorrido em um dia do mês; <strong><code>Resposta = R$ 373.78</code></strong>
- O maior valor de faturamento ocorrido em um dia do mês; <strong><code>Resposta = R$ 48924.24</code></strong>
- Número de dias no mês em que o valor de faturamento diário foi superior à média mensal; <strong><code>Resposta = 10</code></strong>

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;

[Implementação](https://github.com/King-Klauz/Teste-de-Estagio-Target-Sistemas/blob/main/Quest%C3%A3o%203)



<strong><code>4)</code></strong> Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
- SP – R$67.836,43
- RJ – R$36.678,66
- MG – R$29.229,88
- ES – R$27.165,48
- Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

<strong><code>Resposta:</code></strong>
```
SP: 37,53%
RJ: 20,29%
MG: 16,17%
ES: 15,03%
Outros: 10,98%
```
[Implementação](https://github.com/King-Klauz/Teste-de-Estagio-Target-Sistemas/blob/main/Quest%C3%B5es%201%2C%202%2C%204%20e%205/src/respostas/FaturamentoPercentual.java)



<strong><code>5)</code></strong> Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;

   [Implementação](https://github.com/King-Klauz/Teste-de-Estagio-Target-Sistemas/blob/6dbf5db5c8a97602782417341b085833eed64054/Quest%C3%B5es%201%2C%202%2C%204%20e%205/src/respostas/InverterString.java)
