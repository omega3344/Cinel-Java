Algoritmo "escal�es"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/01/2022
Var
// Se��o de Declara��es das vari�veis 
a:inteiro;

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
Escreval ("Introduza a idade do jogador")
Leia(a)

se (a>10) e (a<=17) ent�o
Escreval ("o jogador � do escal�o Juvenil")
sen�o
     se a<=10 ent�o
     Escreval ("o jogador � do escal�o Infantil")
     sen�o
     Escreval ("o jogador � do escal�o S�nior")
     fimse
fimse

Fimalgoritmo