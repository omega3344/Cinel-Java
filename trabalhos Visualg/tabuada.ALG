Algoritmo "tabuada"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/01/2022
Var
// Se��o de Declara��es das vari�veis 

a,b:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

Escreval ("introduza um n�mero")
Leia(a)

b<-1

Escreval("Tabuada do",a)

repita
      escreval(a," X",b," = ",(a*b))
      b<-b+1
ate b>10

Fimalgoritmo