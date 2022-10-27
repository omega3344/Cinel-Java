Algoritmo "funções - exercicio1"
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/02/2022
Var
// Seção de Declarações das variáveis 

a,anos,meses,dias:inteiro
minutos:real

funcao calcular_minutos:real

inicio

minutos<-(anos*525960)+(meses*43830)+(dias*1440)
retorne minutos

fimfuncao

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

escreval("Introduza o número de anos:")
leia(anos)
escreval("Introduza o número de meses:")
leia(meses)
escreval("Introduza o número de dias:")
leia(dias)

minutos<-calcular_minutos

escreval("quer o resultado em minutos (1) ou segundos (2)?")
leia(a)

escolha (a)
        caso 1
             escreval("a sua idade em minutos é",minutos)
        caso 2
             escreval("a sua idade em segundos é",(minutos*60))
fimescolha



Fimalgoritmo