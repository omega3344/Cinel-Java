package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] v = new integer[7];
        int[] m2 = new integer[7];
        int[] m3 = new integer[7];
        int[] m23 = new integer[7];
        int a;

        Scanner scanner = new Scanner(System.in);

        for (a=0;a<7;a++)  {
            System.out.println("Introduza o "+a+"º número: ");
            v[a] = scanner.nextInt();
        }
        for (a=0;a<7;a++)  {
            if((v[a]%2==0)&&(v[a]%3==0))	{
                m23[a]=v[a];
            }
            if((v[a]%2==0))	{
                m2[a]=v[a];
            }
            if((v[a]%3==0))	{
                m3[a]=v[a];
            }
        }

        System.out.println("Os números múltiplos de 2 são: ");
        for (a=0;a<7;a++)  {
            if((m2[a]!=0))	{
                System.out.println(m2[a]);
            }
        }

        System.out.println("Os números múltiplos de 3 são: ");
        for (a=0;a<7;a++)  {
            if((m3[a]!=0))	{
                System.out.println(m3[a]);
            }
        }

        System.out.println("Os números múltiplos de 2 e de 3 são: ");
        for (a=0;a<7;a++)  {
            if((m23[a]!=0))	{
                System.out.println(m23[a]);
            }
        }

        scanner.close();

    }

}
