Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19-01-2022
Var
// Se��o de Declara��es das vari�veis 

n1,n2,media:real;

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

Escreval("insira um n�mero")
Leia(n1)

Escreval("insira um n�mero")
Leia(n2)
Media<-(n1+n2)/2
//Escreva("a m�dia ",media)
Se media>=10 ent�o
   Escreval(" o aluno foi aprovado com ",media)
senao
     Escreval(" o aluno foi reprovado com ",media)
fimse

Fimalgoritmo