package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] livro = new double[20];
        double total = 0;
        int a;

        Scanner scanner = new Scanner(System.in);

        for (a=0;a<20;a++)  {
            System.out.println("Introduza o preço do "+(a+1)+"º livro: ");
            livro[a] = scanner.nextDouble();
            if((livro[a])==0)	{
                break;
            }else	{
                total = (total+livro[a]);
            }
        }


        System.out.println("O valor total da coleção é "+total+" e tem "+a+" livros, com um custo médio de "+(total/a));

        scanner.close();

    }

}


