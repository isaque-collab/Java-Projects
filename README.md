# 📦 Java — Estruturas de Condição

> Projetos práticos desenvolvidos durante o aprendizado de Java, com foco em lógica de negócio real e aplicações de back-end.

---

## 🚀 Sobre o repositorio

Este repositório reúne 6 projetos desenvolvidos com **Java**, aplicando estruturas de condição (`if`, `else if`, `else`) em cenários do mundo real — como sistemas financeiros, e-commerce e seguros.

Cada projeto simula uma regra de negócio real, do tipo que aparece em sistemas back-end profissionais.

---

## 🛠️ Tecnologias

- JAVA
- Scanner (entrada de dados via terminal)
- Lógica condicional e regras de negócio

---

## 📁 Projetos

### 1. 🏧 Simulador de Caixa Eletrônico


O programa recebe um valor de saque e calcula automaticamente a menor quantidade de cédulas necessária para compor esse valor, usando as notas de R$ 200, R$ 100, R$ 50, R$ 20 e R$ 10.

A lógica usa o operador de divisão inteira `/` para saber quantas cédulas cabem no valor, e o operador de resto `%` para descobrir quanto sobra para as próximas cédulas. Cédulas com quantidade zero não são exibidas.

**Conceitos aplicados:**
- Operadores `/` e `%` para divisão inteira e resto
- Variável de resto acumulada a cada etapa
- Condições `if` para omitir cédulas zeradas na saída

**Exemplo:**
```
Digite o valor do saque: 380

Cédulas de 200: 1
Cédulas de 100: 1
Cédulas de 50: 1
Cédulas de 20: 1
Cédulas de 10: 1
```

---

### 2. 🚚 Sistema de Frete

O programa recebe a região do Brasil, o peso do produto em kg e o valor total do pedido. Com base nesses dados, calcula o valor do frete multiplicando o peso pelo preço por kg de cada região, e aplica automaticamente um desconto de 20% no frete quando o valor do pedido ultrapassa R$ 300,00.

Cada região tem seu próprio preço por kg e prazo de entrega, simulando uma tabela de frete real de e-commerce.

**Conceitos aplicados:**
- Seleção de regras por região com `if/else if`
- Desconto condicional baseado no valor do pedido
- Uso de `toLowerCase()` para tratar entrada do usuário sem diferenciar maiúsculas de minúsculas
- Formatação monetária com `printf`

**Tabela de frete:**
| Região | Preço/kg | Prazo |
|---|---|---|
| Sudeste | R$ 5,00 | 3 dias |
| Sul | R$ 7,00 | 5 dias |
| Nordeste | R$ 10,00 | 7 dias |
| Norte | R$ 15,00 | 12 dias |
| Centro-Oeste | R$ 8,00 | 6 dias |

**Exemplo:**
```
Região: nordeste | Peso: 3kg | Pedido: R$ 350,00

Frete base: R$ 30,00
Desconto (20%): R$ 6,00
Total do frete: R$ 24,00
Prazo de entrega: 7 dias
```

---

### 3. 💳 Aprovação de Crédito

O programa simula um motor de aprovação de crédito bancário. Ele recebe a renda mensal do solicitante, o valor do crédito desejado, o score de crédito e se possui dívidas ativas. Com base nesses dados, retorna se o crédito foi aprovado, aprovado com restrição ou negado.

Duas regras eliminatórias são verificadas primeiro: se o score for ruim (abaixo de 400) ou se o valor solicitado ultrapassar 30% da renda mensal, o crédito é negado imediatamente, independente dos outros fatores.

**Conceitos aplicados:**
- Classificação de score em três categorias (bom, regular, ruim)
- Regras eliminatórias verificadas antes das demais
- Combinação de múltiplas condições com `&&`
- Cálculo de limite máximo baseado em percentual da renda

**Regras de aprovação:**
| Score | Dívidas | Resultado |
|---|---|---|
| Bom (>700) | Não | Aprovado |
| Bom (>700) | Sim | Aprovado com restrição |
| Regular (400-700) | Não | Aprovado com restrição |
| Regular (400-700) | Sim | Negado |
| Ruim (<400) | Qualquer | Negado |

**Exemplo:**
```
Renda: R$ 3.000 | Valor: R$ 500 | Score: 750 | Dívidas: não

Resultado: Aprovado
```

---

### 4. 🏷️ Calculadora de Desconto de Loja

O programa calcula o desconto final de uma compra com base em três fatores que se acumulam: a categoria de fidelidade do cliente (bronze, prata ou ouro), se é o aniversário do cliente e se o valor da compra ultrapassa R$ 500,00.

A sacada do projeto é acumular o percentual de desconto em uma única variável antes de aplicar ao valor da compra, em vez de calcular cada desconto separadamente. Isso torna o código mais limpo e fácil de manter.

**Conceitos aplicados:**
- Acúmulo de percentual com `+=`
- Três condições independentes que se somam
- Cálculo de economia e valor final

**Tabela de descontos:**
| Fator | Desconto |
|---|---|
| Cliente Bronze | 5% |
| Cliente Prata | 10% |
| Cliente Ouro | 15% |
| Aniversário | +10% |
| Compra acima de R$ 500 | +5% |

**Exemplo:**
```
Categoria: ouro | Compra: R$ 600,00 | Aniversário: sim

Desconto aplicado: 30%
Valor original: R$ 600,00
Você economizou: R$ 180,00
Total a pagar: R$ 420,00
```

---

### 5. 🚗 Mini Motor de Regras de Seguro

O programa classifica o perfil de risco de um segurado e define o valor da apólice com base em quatro fatores: idade, tipo de veículo, histórico de acidentes e localização (capital ou interior). Cada fator contribui com uma pontuação, e a soma total define se o perfil é de risco baixo, médio ou alto.

Esse modelo de pontuação acumulada é amplamente usado em sistemas reais de seguradoras e fintechs, onde múltiplos fatores de risco precisam ser ponderados juntos para chegar a uma decisão.

**Conceitos aplicados:**
- Sistema de pontuação acumulada com `+=`
- Classificação final baseada em faixas de pontos
- Múltiplos fatores de risco independentes

**Tabela de pontuação:**
| Fator | Condição | Pontos |
|---|---|---|
| Idade | Menor de 25 | +3 |
| Idade | Entre 25 e 60 | +0 |
| Idade | Acima de 60 | +1 |
| Veículo | Moto | +3 |
| Veículo | Caminhão | +2 |
| Veículo | Carro | +1 |
| Acidentes | 1 acidente | +2 |
| Acidentes | 2 ou mais | +4 |
| Local | Capital | +2 |

**Classificação final:**
| Pontos | Perfil | Apólice |
|---|---|---|
| 0 a 3 | Baixo | R$ 1.200,00 |
| 4 a 6 | Médio | R$ 2.500,00 |
| 7 ou mais | Alto | R$ 4.000,00 |

**Exemplo:**
```
Idade: 22 | Veículo: moto | Acidentes: 1 | Local: capital

Perfil de risco: Alto
Valor da apólice: R$ 4.000,00
```

---

### 6. 📦 Sistema de Classificação de Pedidos

O programa simula o motor de decisão de um sistema de e-commerce. Ele recebe o status do pedido, a forma de pagamento e a disponibilidade de estoque, e define automaticamente qual deve ser o próximo passo no fluxo do pedido.

O projeto introduz o conceito de `if` aninhado — um `if` dentro de outro — que é a estrutura ideal quando a segunda decisão só faz sentido se a primeira já foi tomada. Por exemplo: só faz sentido verificar a forma de pagamento se o pedido for novo e tiver estoque disponível.

**Conceitos aplicados:**
- `if` aninhado para decisões em cascata
- Fluxo de estados de um pedido real

**Tabela de decisões:**
| Status | Pagamento | Estoque | Próximo passo |
|---|---|---|---|
| Novo | PIX ou Cartão | Sim | Separar pedido |
| Novo | Boleto | Sim | Aguardar pagamento |
| Novo | Qualquer | Não | Notificar cliente: sem estoque |
| Pago | Qualquer | Sim | Enviar para entrega |
| Pago | Qualquer | Não | Notificar cliente: sem estoque |
| Cancelado | Qualquer | Qualquer | Pedido encerrado |

**Exemplo:**
```
Status: novo | Pagamento: pix | Estoque: sim

Próximo passo: Separar pedido
```

---



## 👨‍💻 Autor

Feito por **Isaque Costa da Cunha** durante o aprendizado de Java Back-end.
