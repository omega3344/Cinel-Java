Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19-01-2022
Var
// Seção de Declarações das variáveis 

n1,n2,media:real;

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

Escreval("insira um número")
Leia(n1)

Escreval("insira um número")
Leia(n2)
Media<-(n1+n2)/2
//Escreva("a média ",media)
Se media>=10 então
   Escreval(" o aluno foi aprovado com ",media)
senao
     Escreval(" o aluno foi reprovado com ",media)
fimse

Fimalgoritmo