# Projeto Conta Corrente - Java

![Tela do Projeto](./src/img/ProjetoContaCorrente.png)

Este projeto é um simulador de conta corrente desenvolvido em Java, que permite ao usuário realizar operações bancárias como consulta de saldo, recebimento de créditos e transferência de valores. O sistema demonstra o uso de controle de fluxo, operações aritméticas e formatação monetária utilizando a classe `NumberFormat` para exibir valores no padrão brasileiro.

## Descrição do Projeto

O programa inicia solicitando o nome do cliente e o saldo inicial, apresentando em seguida um menu interativo com as seguintes opções:
- **Consultar Saldo:** Exibe o saldo atual formatado em moeda brasileira.
- **Receber Valor:** Permite adicionar um crédito ao saldo.
- **Transferir Valor:** Realiza uma transferência, debitando o saldo, se houver saldo suficiente.
- **Sair:** Encerra o programa.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação utilizada para o desenvolvimento do simulador.
- **NumberFormat:** Classe para formatação de valores monetários no padrão brasileiro.
- **Scanner:** Utilizado para entrada de dados via console.

## Funcionalidades Implementadas

- **Entrada de Dados:** Coleta do nome do cliente e saldo inicial.
- **Menu Interativo:** Permite selecionar diferentes operações bancárias.
- **Validação de Operações:** Verifica se há saldo suficiente para realizar uma transferência.
- **Formatação de Moeda:** Exibe os valores com a formatação monetária brasileira.

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/SeuUsuario/ProjetoContaCorrente.git
   ```

2. Compile o projeto:
  ```bash
  javac ProjetoContaCorrente.java
  ```
3. Execute o projeto:
  ```bash
  java ProjetoContaCorrente
  ```

## Estrutura de Pastas

- **ProjetoContaCorrente.java**: Arquivo principal contendo o código fonte do simulador.
- **src/img/**: Pasta que contém imagens do projeto, como capturas de tela.

## Autor

Desenvolvido por Raphael como parte do curso de Análise e Desenvolvimento de Sistemas na FIAP.

## Licença

Este projeto é de uso livre para fins de aprendizado. Se usar partes deste projeto, por favor, dê os devidos créditos.
