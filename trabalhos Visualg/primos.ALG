Algoritmo "primos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/01/2022
Var
// Seção de Declarações das variáveis 

a,b,c,d,p:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

Escreval("Indique o inicio do intervalo")
leia(a)
Escreval("Indique o fim do intervalo")
leia(b)

para c de a ate b faca
     p<-0
     para d de 1 ate c faca
          se c mod d = 0 entao
             p<-p+1
          fimse
     fimpara
     se p=2 entao
             escreval("o número",c," é primo")
     fimse
fimpara


Fimalgoritmo