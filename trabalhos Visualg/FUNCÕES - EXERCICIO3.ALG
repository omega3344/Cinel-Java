Algoritmo "funções - exercicio3"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/02/2022
Var
// Seção de Declarações das variáveis 

a:vetor[1..50] de inteiro
x,maior,menor:inteiro

funcao maior_menor:inteiro

inicio

para x de 1 ate 50 faca
   se menor>a[x] entao
      menor<-a[x]
   fimse
   se maior<a[x] entao
      maior<-a[x]
   fimse
retorne maior,menor

fimfuncao

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...


para x de 1 ate 50 faca
     escreval("Introduza 50 números inteiros:")
     leia(a[x])
fimpara

menor<-a[1]
valor<-maior_menor

se (valor)=VERDADEIRO entao
      escreval("O número",a," é par")
senao
      escreval("O número",a," é ímpar")
fimse



Fimalgoritmo