Algoritmo "exercicio2"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 31/01/2022
Var
// Seção de Declarações das variáveis 

faltas,nota1,nota2,media:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreval("introduza o número de faltas do aluno:")
leia(faltas)

se faltas>10 então
   escreval("REPROVADO POR FALTAS")
senao
     escreval("introduza a 1ª nota:")
     leia(nota1)
     escreval("introduza a 2ª nota:")
     leia(nota2)
     media<-((nota1+nota2)/2)
     se (media>0) e (media<5) entao
        escreval("Reprovado")
     fimse
     se (media>=5) e (media<=6) entao
        escreval("Recuperação")
     fimse
     se (media>6) e (media<=10) entao
        escreval("Aprovado")
     fimse
fimse

Fimalgoritmo