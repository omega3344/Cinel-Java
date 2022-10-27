package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int faltas;
        double nota1,nota2,media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza o número de faltas do aluno:");
        faltas = scanner.nextInt();

        if(faltas>10)	{
            System.out.println("REPROVADO POR FALTAS");
        }else	{
            System.out.println("Introduza a 1ª nota:");
            nota1 = scanner.nextDouble();
            System.out.println("Introduza a 2ª nota:");
            nota2 = scanner.nextDouble();
            media = ((nota1+nota2)/2);
            if((media>0)&&(media<5))	{
                System.out.println("Reprovado");
            }
            if((media>=5)&&(media<=6))	{
                System.out.println("Recuperação");
            }
            if((media>6)&&(media<=10))	{
                System.out.println("Aprovado");
            }
        }

        scanner.close();

    }

}

