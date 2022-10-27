Algoritmo "exercicio1"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 31/01/2022
Var
// Seção de Declarações das variáveis 

enc1,enc2,enc3,enctotal,valor:real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("introduza o peso da 1ª encomenda")
leia(enc1)
escreval("introduza o peso da 2ª encomenda")
leia(enc2)
escreval("introduza o peso da 3ª encomenda")
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

escreval("o valor total a pagar é:",valor)


Fimalgoritmo