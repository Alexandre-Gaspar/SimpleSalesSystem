# 🚀 Sistema de Pedidos em Java
> ## Descrição
>> Este projeto implementa um sistema simples de pedidos em Java, com funcionalidades básicas de cadastro de clientes, cadastro de produtos, realização de pedidos, cálculo do total do pedido e geração de resumo do pedido.

## Classes:
### 1. Order
Representa um pedido e possui os seguintes atributos:

- `moment`: Data e hora do pedido
- `status`: Status do pedido (pendente, em processamento, enviado, entregue)
- `items`: Lista de itens do pedido
- `client`: Cliente que fez o pedido
### 2. OrderItem
Representa um item de um pedido e possui os seguintes atributos:

- `quantity`: Quantidade do item
- `product`: Produto do item
### 3. Product
Representa um produto e possui os seguintes atributos:

- `name`: Nome do produto
- `price`: Preço do produto
### 4. Client
Representa um cliente e possui os seguintes atributos:

- `name`: Nome do cliente
- `email`: E-mail do cliente
- `birthDate`: Data de nascimento do cliente

## Diagrama de calsses (UML)

<div align="center">
  <img src="https://github.com/Alexandre-Gaspar/SimpleSalesSystem/assets/118801719/491f96cd-56aa-4022-97b2-77d766d7f739" />
</div>

## Funcionalidades:
+ Adicionar item a um pedido: A classe Order possui o método addItem(item: OrderItem) que permite adicionar um item a um pedido.
+ Remover item de um pedido: A classe Order possui o método removeItem(item: OrderItem) que permite remover um item de um pedido.
+ Calcular total do pedido: A classe Order possui o método total() que calcula o total do pedido.
+ Gerar resumo do pedido: A classe Order possui o método summary() que gera um resumo do pedido.

## Execução
Para executar o projeto, siga os seguintes passos:

1. Clone o projeto para o seu computador.
2. Abra o projeto em um IDE Java.
3. Compile o projeto.
4. Execute a classe principal (Main).
## ⚠️ Observações
Este é um projeto simples para fins didáticos.
O projeto pode ser adaptado e extendido para atender a necessidades específicas.
