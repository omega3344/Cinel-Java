Algoritmo "tabuada"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/01/2022
Var
// Seção de Declarações das variáveis 

a,b:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

Escreval ("introduza um número")
Leia(a)

b<-1

Escreval("Tabuada do",a)

repita
      escreval(a," X",b," = ",(a*b))
      b<-b+1
ate b>10

Fimalgoritmo