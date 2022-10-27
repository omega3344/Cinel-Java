Algoritmo "escalões"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/01/2022
Var
// Seção de Declarações das variáveis 
a:inteiro;

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreval ("Introduza a idade do jogador")
Leia(a)

se (a>10) e (a<=17) então
Escreval ("o jogador é do escalão Juvenil")
senão
     se a<=10 então
     Escreval ("o jogador é do escalão Infantil")
     senão
     Escreval ("o jogador é do escalão Sénior")
     fimse
fimse

Fimalgoritmo