Algoritmo "matrizes - exercicio1"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/02/2022
Var
// Se��o de Declara��es das vari�veis 
v:vetor[1..3,1..3] de inteiro
x,y:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

aleatorio 0,99

para x de 1 ate 3 faca
     para y de 1 ate 3 faca
          escreva("Matriz ",x,",",y,":")
     leia(v[x,y])
     fimpara
fimpara

aleatorio off

para x de 1 ate 3 faca
     para y de 1 ate 3 faca
        se v[x,y] mod 2 = 0 entao
           escreva(v[x,y])
        fimse
     fimpara
fimpara

Fimalgoritmo