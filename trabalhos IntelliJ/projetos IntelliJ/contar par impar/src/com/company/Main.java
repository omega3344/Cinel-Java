package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[5];
        int b;
        int c = 0;
        char d;

        Scanner scanner = new Scanner(System.in);

        for (b=0;b<5;b++)  {
            System.out.println("Introduza o "+b+"º número: ");
            a[b] = scanner.nextInt();
        }

        do {
            System.out.println("Introduza (p) para contar os pares ou (i) para contar os ímpares");
            d = scanner.nextChar();
        }while ((d=="p") || (d=="P") || (d=="i") || (d=="I"));	{
        }

        if((d="p") || (d="P"))	{
            for (b=0;b<5;b++)	{
                if(a[b]&2=0)	{
                    c++;
                }
            }
            System.out.println("O total de números pares é "+c);
        }

        if((d="i") || (d="I"))	{
            for (b=0;b<5;b++)	{
                if(a[b]&2=0)	{
                    c++;
                }
            }
            System.out.println("O total de números ímpares é "+c);
        }

        scanner.close();

    }

}

