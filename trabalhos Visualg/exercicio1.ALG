Algoritmo "exercicio1"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 31/01/2022
Var
// Se��o de Declara��es das vari�veis 

enc1,enc2,enc3,enctotal,valor:real


Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

escreval("introduza o peso da 1� encomenda")
leia(enc1)
escreval("introduza o peso da 2� encomenda")
leia(enc2)
escreval("introduza o peso da 3� encomenda")
leia(enc3)

enctotal<-enc1+enc2+enc3
se (enctotal<=500) entao
   valor<-(enctotal*0.5)
fimse
se (enctotal>500) e (enctotal<=600) entao
   valor<-((enctotal-500)*5)+(enctotal*0.5)
fimse
se (enctotal>600) e (enctotal<=1000) entao
   valor<-((enctotal-500)*8)+(enctotal*0.5)
fimse
se (enctotal>1000) e (enctotal<=1500) entao
   valor<-((enctotal-500)*10)+(enctotal*0.5)
fimse
se (enctotal>1500) entao
   valor<-((enctotal-500)*15)+(enctotal*0.5)
fimse

escreval("o valor total a pagar �:",valor)


Fimalgoritmo