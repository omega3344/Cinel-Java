Algoritmo "vetor 10"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/02/2022
Var
// Se��o de Declara��es das vari�veis 

num:vetor[1..10] de real
positivo:real
a,negativo:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

para a de 1 ate 10 faca
     escreval("introduza o",a,"� n�mero")
     leia(num[a])
     se num[a]<0 entao
        negativo<-negativo+1
     senao
          positivo<-positivo+num[a]
     fimse
fimpara

escreval("foram introduzidos",negativo," n�meros negativos")
escreval("a soma dos n�meros positivos �",positivo)

Fimalgoritmo