package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] i1 = new interger[10];
        int[] i2 = new interger[5];
        int[] v1 = new interger[10];
        int[] v2 = new interger[10];
        int a;

        Scanner scanner = new Scanner(System.in);

        for (a=1;a<11;a++)  {
            System.out.println("Introduza o "+a+"º número do 1º vetor: ");
            i1[a] = scanner.nextInterger();
        }

        for (a=1;a<6;a++)  {
            System.out.println("Introduza o "+a+"º número do 2º vetor: ");
            i2[a] = scanner.nextInterger();
        }

        for (a=1;a<6;a++)  {
            v1[a]=(i1[a*2])+(i1[(a+2)]-1);
            v1[a+5]=i2[a];
        }

        for (a=1;a<11;a++)  {
            if(v1[a]%2!=0)	{
                v2[a]=v1[a];
            }
            if(i1[a]%2!=0)	{
                v2[a]=i1[a];
            }
        }

        System.out.println("O vetor carregado com os valores emparelhados introduzidos no 1º vetor, seguido dos valores introduzidos no 2º vetor");

        for (a=1;a<11;a++)  {
            System.out.println(v1[a]);
        }

        System.out.println("O vetor carregado com os valores ímpares de todos os vetores anteriores");

        for (a=1;a<11;a++)  {
            System.out.println(v2[a]);
        }

        scanner.close();

    }

}

