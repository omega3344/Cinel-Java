Algoritmo "primos"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/01/2022
Var
// Se��o de Declara��es das vari�veis 

a,b,c,d,p:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

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
             escreval("o n�mero",c," � primo")
     fimse
fimpara


Fimalgoritmo