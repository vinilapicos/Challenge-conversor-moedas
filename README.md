# Challenge Conversor de Moedas

![Status: Concluído](https://img.shields.io/badge/status-concluído-brightgreen)
![Tecnologias](https://img.shields.io/badge/Java-orange?style=flat&logo=openjdk)

<br>

## 📜 Índice

1.  [Sobre o Projeto](#1-sobre-o-projeto)
2.  [Principais Funcionalidades](#2-principais-funcionalidades)

<br>

## 1. Sobre o Projeto

O challenge do conversor de moedas consiste em criar um conversor de moedas utilizando 
java que ofereça interação com o usuário, proporcionando 6 opções distintas de conversões 
de moedas por meio de um menu. A taxa de conversão não é estática e sim dinâmica, obtida por meio de uma API, garantindo dados preciso e em tempo real.

<br>

## 2. Principais Funcionalidades

| Funcionalidade | Descrição |
| :--- | :--- |
| **Exibição de Menu** | O conversor de moedas exibe um menu com todas as opções possíveis de conversão para o usuário, utilizando um switch case para modificar sua execução baseado na opção selecionada. |
| **Formatação de Valor**| O valor definido pelo usuário que será convertido é formatado utilizando o método replace() para que não haja problemas na utilização de "," ou "." na declaração do valor. |
| **Conversão de Moeda** | A classe ConversorDeMoeda utiliza um de seus métodos para realizar a requisição para a API exchangerate, recebendo um JSON com todas as informações e armazenando apenas o resultado da conversão.|
| **Exibição de Resultado**| A classe ExibeRespostas recebe a classe ConversorDeMoeda e utiliza suas variáveis e metodos para demonstrar o resultado de maneira clara e objetiva. |
