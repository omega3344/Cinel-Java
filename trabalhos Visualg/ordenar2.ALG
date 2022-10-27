Algoritmo "ordenar"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/01/2022
Var
// Seção de Declarações das variáveis 

a,b,c,menor,meio,maior:inteiro;

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

Escreval("Indique o 1º número")
Leia(a)

Escreval("Indique o 2º número")
Leia(b)

Escreval("Indique o 3º número")
Leia(c)


Se a>b então
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

Escreval("Números ordenados:",menor,meio,maior)
   
Fimalgoritmo