Algoritmo "cole��o livros"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/02/2022
Var
// Se��o de Declara��es das vari�veis 
livro:vetor[0..19] de real
total:real
a:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

para a de 0 ate 19 faca
     escreval("introduza o pre�o do",a+1,"� livro")
     leia(livro[a])
     se livro[a] = 0 entao
     interrompa
     senao
     total<-(total+livro[a])
     fimse
fimpara

escreval("o valor total da cole��o �",total," e tem",a," livros, com um custo m�dio de",(total/a))


Fimalgoritmo