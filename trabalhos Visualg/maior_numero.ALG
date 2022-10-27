Algoritmo "maior_numero"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/01/2022
Var
// Seção de Declarações das variáveis 
n1,n2,n3,maior,menor:inteiro;


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

Escreval("Indique o 1º número")
Leia(n1)

Escreval("Indique o 2º número")
Leia(n2)

Escreval("Indique o 3º número")
Leia(n3)

maior<-n1
menor<-n1
Se maior<n2 então
   maior<-n2
fimse
Se maior<n3 então
   maior<-n3
fimse
Se menor>n2 então
   menor<-n2
fimse
Se menor>n3 então
   menor<-n3
fimse


Escreval("O maior número é o:",maior)
Escreval("O maior número é o:",menor)

Fimalgoritmo