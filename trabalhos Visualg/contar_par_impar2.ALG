Algoritmo "contar_par_impar"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/01/2022
Var
// Seção de Declarações das variáveis 

a:vetor[1..5] de inteiro
b,c:inteiro
d:caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

para b de 1 ate 5 faca
     escreval("Introduza o",b,"º número")
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
     escreval("o total de números pares é",c)
fimse

se (d="i") ou (d="I") entao
     para b de 1 ate 5 faca
        se a[b] mod 2 <> 0 entao
           c<-c+1
           fimse
     fimpara
     escreval("o total de números impares é",c)
fimse



Fimalgoritmo