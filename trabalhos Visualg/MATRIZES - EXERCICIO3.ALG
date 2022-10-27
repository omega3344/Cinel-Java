Algoritmo "matrizes - exercicio3"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/02/2022
Var
// Seção de Declarações das variáveis 
u:vetor[1..4,1..4] de inteiro
v:vetor[1..4,1..4] de inteiro
x,y:inteiro
a,b:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("Introduza os valores para a 1ª matriz")
para x de 1 ate 4 faca
     para y de 1 ate 4 faca
          escreval("Posição ",x,",",y,":")
     leia(u[x,y])
     fimpara
fimpara

escreval("Introduza os valores para a 2ª matriz")
para x de 1 ate 4 faca
     para y de 1 ate 4 faca
          escreval("Posição ",x,",",y,":")
     leia(v[x,y])
     fimpara
fimpara

para x de 1 ate 4 faca
     para y de 1 ate 4 faca
          para a de 1 ate 4 faca
               para b de 1 ate 4 faca
                    se u[x,y] = v[a,b] então
                    escreva(u[x,y])
                    fimse
               fimpara
          fimpara
     fimpara
fimpara


Fimalgoritmo