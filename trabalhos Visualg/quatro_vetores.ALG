Algoritmo "quatro_vetores"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/02/2022
Var
// Se��o de Declara��es das vari�veis 
i1:vetor[1..10] de inteiro
i2:vetor[1..5] de inteiro
v1:vetor[1..10] de inteiro
v2:vetor[1..10] de inteiro

a:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

para a de 1 ate 10 faca
     escreval("introduza o",a,"� n�mero do 1� vetor")
     leia(i1[a])
fimpara
para a de 1 ate 5 faca
     escreval("introduza o",a,"� n�mero do 2� vetor")
     leia(i2[a])
fimpara
para a de 1 ate 5 faca
     v1[a]<-(i1[a*2])+(i1[(a*2)-1])
     v1[a+5]<-i2[a]
fimpara
para a de 1 ate 10 faca
     se v1[a] mod 2 <> 0 entao
        v2[a]<-v1[a]
     fimse
     se i1[a] mod 2 <> 0 entao
        v2[a]<-i1[a]
     fimse
fimpara
escreval("")
escreval("vetor carregado com os valores aos pares introduzidos no 1� vetor, seguido dos valores introduzidos no 2� vetor")
para a de 1 ate 10 faca
     escreva(v1[a])
fimpara
escreval("")
escreval("vetor carregado com os valores impares de todos os vetores anteriores")
para a de 1 ate 10 faca
     se (v2[a])<>0 entao
         escreva(v2[a])
     fimse
fimpara





Fimalgoritmo