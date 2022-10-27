package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] num = new double[10];
        double positivo = 0;
        double negativo = 0;
        int a;

        Scanner scanner = new Scanner(System.in);

        for (a=0;a<10;a++)  {
            System.out.println("Introduza o "+(a+1)+"º número: ");
            num[a] = scanner.nextInt();
            if((num[a])<0)	{
                negativo++;
            }else	{
                positivo = positivo + num[a];
            }
        }


        System.out.println("Foram introduzidos "+negativo+" números negativos");
        System.out.println("A soma dos números positivos introduzidos é "+positivo);

        scanner.close();

    }

}
