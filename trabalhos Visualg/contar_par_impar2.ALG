Algoritmo "contar_par_impar"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/01/2022
Var
// Se��o de Declara��es das vari�veis 

a:vetor[1..5] de inteiro
b,c:inteiro
d:caracter

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

para b de 1 ate 5 faca
     escreval("Introduza o",b,"� n�mero")
     leia(a[b])
fimpara

repita
      escreval("Introduza (p) para contar os pares ou (i) para contar os impares")
      leia(d)
ate (d="p") ou (d="P") ou (d="i") ou (d="I")

se (d="p") ou (d="P") entao
     para b de 1 ate 5 faca
        se a[b] mod 2 = 0 entao
           c<-c+1
           fimse
     fimpara
     escreval("o total de n�meros pares �",c)
fimse

se (d="i") ou (d="I") entao
     para b de 1 ate 5 faca
        se a[b] mod 2 <> 0 entao
           c<-c+1
           fimse
     fimpara
     escreval("o total de n�meros impares �",c)
fimse



Fimalgoritmo