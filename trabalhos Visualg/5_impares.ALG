Algoritmo "5 impares"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/01/2022
Var
// Seção de Declarações das variáveis 

a:vetor[1..5] de inteiro
b:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

para b de 1 ate 5 faca
     escreval("Introduza o",b,"º número")
     leia(a[b])
fimpara

para b de 1 ate 5 faca
     se a[b] mod 2 <> 0 entao
        escreval("o número",a[b]," é impar")
     fimse
fimpara


Fimalgoritmo