Algoritmo "vetor 10"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/02/2022
Var
// Seção de Declarações das variáveis 

num:vetor[1..10] de real
positivo:real
a,negativo:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

para a de 1 ate 10 faca
     escreval("introduza o",a,"º número")
     leia(num[a])
     se num[a]<0 entao
        negativo<-negativo+1
     senao
          positivo<-positivo+num[a]
     fimse
fimpara

escreval("foram introduzidos",negativo," números negativos")
escreval("a soma dos números positivos é",positivo)

Fimalgoritmo