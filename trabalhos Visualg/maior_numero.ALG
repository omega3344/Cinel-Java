Algoritmo "maior_numero"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/01/2022
Var
// Se��o de Declara��es das vari�veis 
n1,n2,n3,maior,menor:inteiro;


Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

Escreval("Indique o 1� n�mero")
Leia(n1)

Escreval("Indique o 2� n�mero")
Leia(n2)

Escreval("Indique o 3� n�mero")
Leia(n3)

maior<-n1
menor<-n1
Se maior<n2 ent�o
   maior<-n2
fimse
Se maior<n3 ent�o
   maior<-n3
fimse
Se menor>n2 ent�o
   menor<-n2
fimse
Se menor>n3 ent�o
   menor<-n3
fimse


Escreval("O maior n�mero � o:",maior)
Escreval("O maior n�mero � o:",menor)

Fimalgoritmo