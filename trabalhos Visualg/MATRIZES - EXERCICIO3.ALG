Algoritmo "matrizes - exercicio3"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/02/2022
Var
// Se��o de Declara��es das vari�veis 
u:vetor[1..4,1..4] de inteiro
v:vetor[1..4,1..4] de inteiro
x,y:inteiro
a,b:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

escreval("Introduza os valores para a 1� matriz")
para x de 1 ate 4 faca
     para y de 1 ate 4 faca
          escreval("Posi��o ",x,",",y,":")
     leia(u[x,y])
     fimpara
fimpara

escreval("Introduza os valores para a 2� matriz")
para x de 1 ate 4 faca
     para y de 1 ate 4 faca
          escreval("Posi��o ",x,",",y,":")
     leia(v[x,y])
     fimpara
fimpara

para x de 1 ate 4 faca
     para y de 1 ate 4 faca
          para a de 1 ate 4 faca
               para b de 1 ate 4 faca
                    se u[x,y] = v[a,b] ent�o
                    escreva(u[x,y])
                    fimse
               fimpara
          fimpara
     fimpara
fimpara


Fimalgoritmo