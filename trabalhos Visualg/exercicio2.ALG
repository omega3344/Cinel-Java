Algoritmo "exercicio2"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 31/01/2022
Var
// Se��o de Declara��es das vari�veis 

faltas,nota1,nota2,media:real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

escreval("introduza o n�mero de faltas do aluno:")
leia(faltas)

se faltas>10 ent�o
   escreval("REPROVADO POR FALTAS")
senao
     escreval("introduza a 1� nota:")
     leia(nota1)
     escreval("introduza a 2� nota:")
     leia(nota2)
     media<-((nota1+nota2)/2)
     se (media>0) e (media<5) entao
        escreval("Reprovado")
     fimse
     se (media>=5) e (media<=6) entao
        escreval("Recupera��o")
     fimse
     se (media>6) e (media<=10) entao
        escreval("Aprovado")
     fimse
fimse

Fimalgoritmo