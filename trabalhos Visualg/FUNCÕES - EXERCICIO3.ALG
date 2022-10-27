Algoritmo "funções - exercicio3"
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
fimpara

retorne maior,menor

fimfuncao

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

escreval("Introduza 50 números inteiros:")
para x de 1 ate 50 faca
    leia(a[x])
fimpara

menor<-maior_menor
maior<-maior_menor

escreval("O menor número introduzido é o",menor," e o maior número introduzido é o",maior)



Fimalgoritmo