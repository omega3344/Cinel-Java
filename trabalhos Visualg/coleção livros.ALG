Algoritmo "coleção livros"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/02/2022
Var
// Seção de Declarações das variáveis 
livro:vetor[0..19] de real
total:real
a:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

para a de 0 ate 19 faca
     escreval("introduza o preço do",a+1,"º livro")
     leia(livro[a])
     se livro[a] = 0 entao
     interrompa
     senao
     total<-(total+livro[a])
     fimse
fimpara

escreval("o valor total da coleção é",total," e tem",a," livros, com um custo médio de",(total/a))


Fimalgoritmo