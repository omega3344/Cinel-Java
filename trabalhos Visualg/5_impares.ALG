Algoritmo "5 impares"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/01/2022
Var
// Se��o de Declara��es das vari�veis 

a:vetor[1..5] de inteiro
b:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

para b de 1 ate 5 faca
     escreval("Introduza o",b,"� n�mero")
     leia(a[b])
fimpara

para b de 1 ate 5 faca
     se a[b] mod 2 <> 0 entao
        escreval("o n�mero",a[b]," � impar")
     fimse
fimpara


Fimalgoritmo