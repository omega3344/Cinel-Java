Algoritmo "ordenar"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/01/2022
Var
// Se��o de Declara��es das vari�veis 

a,b,c,menor,meio,maior:inteiro;

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
      menor<-c
      meio<-b
      maior<-a
   senao
      se a<c entao
         menor<-b
         meio<-a
         maior<-c
      senao
         menor<-b
         meio<-c
         maior<-a
      fimse
   fimse
senao
   se b>c entao
      se a>c entao
         menor<-c
         meio<-a
         maior<-b
      senao
           menor<-a
           meio<-c
           maior<-b
      fimse
   senao
      menor<-a
      meio<-b
      maior<-c
   fimse
fimse

Escreval("N�meros ordenados:",menor,meio,maior)
   
Fimalgoritmo