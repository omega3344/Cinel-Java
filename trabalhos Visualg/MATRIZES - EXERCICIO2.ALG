Algoritmo "matrizes - exercicio2"

// Data atual  : 07/02/2022
Var
// Seção de Declarações das variáveis 
v:vetor[1..2,1..3] de inteiro
x,y:inteiro
a,b:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

aleatorio 0,6

para x de 1 ate 2 faca
     para y de 1 ate 3 faca
          escreva("Matriz ",x,",",y,":")
     leia(v[x,y])
         para a de 1 ate x faca
              para b de 1 ate y faca
                 se v[x,y] = v[a,b] entao
                    leia(v[x,y])
                 fimse
              fimpara
         fimpara
     fimpara
fimpara

aleatorio off



Fimalgoritmo