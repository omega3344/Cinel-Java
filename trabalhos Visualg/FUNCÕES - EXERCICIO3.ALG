Algoritmo "fun��es - exercicio3"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/02/2022
Var
// Se��o de Declara��es das vari�veis 

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
// Se��o de Comandos, procedimento, fun��es, operadores, etc...


para x de 1 ate 50 faca
     escreval("Introduza 50 n�meros inteiros:")
     leia(a[x])
fimpara

menor<-a[1]
valor<-maior_menor

se (valor)=VERDADEIRO entao
      escreval("O n�mero",a," � par")
senao
      escreval("O n�mero",a," � �mpar")
fimse



Fimalgoritmo