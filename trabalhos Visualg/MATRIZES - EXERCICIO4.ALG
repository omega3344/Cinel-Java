Algoritmo "matrizes - exercicio4"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/02/2022
Var
// Seção de Declarações das variáveis 

v:vetor[1..3,1..3] de inteiro
z,x,y,a,b:inteiro


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

para x de 1 ate 3 faca
     para y de 1 ate 3 faca
          escreval("Introduza a posição ",x,",",y,":")
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