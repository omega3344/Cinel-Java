Algoritmo "matrizes - exercicio4"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/02/2022
Var
// Se��o de Declara��es das vari�veis 

v:vetor[1..3,1..3] de inteiro
z,x,y,a,b:inteiro


Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

para x de 1 ate 3 faca
     para y de 1 ate 3 faca
          escreval("Introduza a posi��o ",x,",",y,":")
     leia(v[x,y])
     fimpara
fimpara

para x de 1 ate 3 faca
     para y de 1 ate 3 faca
          para a de 1 ate 3 faca
               para b de 1 ate 3 faca
                   se v[x,y]<v[a,b] entao
                      z<-v[x,y]
                      v[x,y]<-v[a,b]
                      v[a,b]<-z
                   fimse
              fimpara
          fimpara
     fimpara
fimpara

para x de 1 ate 3 faca
     para y de 1 ate 3 faca
          escreval(v[x,y])
     fimpara
fimpara


Fimalgoritmo