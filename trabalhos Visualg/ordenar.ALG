Algoritmo "ordenar"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/01/2022
Var
// Seção de Declarações das variáveis 

a,b,c:inteiro;

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
      Escreval("Números ordenados:",c,b,a)
   senao
      se a<c entao
         Escreval("Números ordenados:",b,a,c)
      senao
         Escreval("Números ordenados:",b,c,a)
      fimse
   fimse
senao
   se b>c entao
      se a>c entao
         Escreval("Números ordenados:",c,a,b)
      senao
         Escreval("Números ordenados:",a,c,b)
      fimse
   senao
      Escreval("Números ordenados:",a,b,c)
   fimse
fimse
   
Fimalgoritmo