Algoritmo "fun��es - exercicio1"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/02/2022
Var
// Se��o de Declara��es das vari�veis 

a,anos,meses,dias:inteiro
resultado:inteiro
minutos:inteiro

funcao calcular_minutos:inteiro

inicio

minutos<-(anos*525960)+(meses*43830)+(dias*1440)
retorne minutos

fimfuncao

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...

escreval("Introduza o n�mero de anos:")
leia(anos)
escreval("Introduza o n�mero de meses:")
leia(meses)
escreval("Introduza o n�mero de dias:")
leia(dias)

resultado<-calcular_minutos

escreval("quer o resultado em minutos (1) ou segundos (2)?")
leia(a)

escolha (a)
        caso 1
             escreval("a sua idade em minutos �",resultado)
        caso 2
             escreval("a sua idade em segundos �",(resultado*60))
fimescolha




Fimalgoritmo