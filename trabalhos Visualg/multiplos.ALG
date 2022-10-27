Algoritmo "multiplos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/02/2022
Var
// Seção de Declarações das variáveis 
v:vetor[1..7] de inteiro
m2:vetor[1..7] de inteiro
m3:vetor[1..7] de inteiro
m23:vetor[1..7] de inteiro
a:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

para a de 1 ate 7 faca
     escreval("intruduza o",a,"º número")
     leia(v[a])
fimpara
para a de 1 ate 7 faca
     se (v[a] mod 2 = 0) e (v[a] mod 3 = 0) entao
         m23[a]<-v[a]
     fimse
     se v[a] mod 2 = 0 entao
     m2[a]<-v[a]
     fimse
     se v[a] mod 3 = 0 entao
     m3[a]<-v[a]
     fimse
fimpara

escreval("os números multiplos de 2 são:")
para a de 1 ate 7 faca
     se m2[a] <> 0 entao
          escreval(m2[a])
     fimse
fimpara
escreval("os números multiplos de 3 são:")
para a de 1 ate 7 faca
     se m3[a] <> 0 entao
          escreval(m3[a])
     fimse
fimpara
escreval("os números multiplos de 2 e de 3 são:")
para a de 1 ate 7 faca
     se m23[a] <> 0 entao
          escreval(m23[a])
     fimse
fimpara
     
Fimalgoritmo