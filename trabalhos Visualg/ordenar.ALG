Algoritmo "ordenar"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/01/2022
Var
// Se��o de Declara��es das vari�veis 

a,b,c:inteiro;

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

Escreval("Indique o 1� n�mero")
Leia(a)

Escreval("Indique o 2� n�mero")
Leia(b)

Escreval("Indique o 3� n�mero")
Leia(c)


Se a>b ent�o
   se b>c entao
      Escreval("N�meros ordenados:",c,b,a)
   senao
      se a<c entao
         Escreval("N�meros ordenados:",b,a,c)
      senao
         Escreval("N�meros ordenados:",b,c,a)
      fimse
   fimse
senao
   se b>c entao
      se a>c entao
         Escreval("N�meros ordenados:",c,a,b)
      senao
         Escreval("N�meros ordenados:",a,c,b)
      fimse
   senao
      Escreval("N�meros ordenados:",a,b,c)
   fimse
fimse
   
Fimalgoritmo