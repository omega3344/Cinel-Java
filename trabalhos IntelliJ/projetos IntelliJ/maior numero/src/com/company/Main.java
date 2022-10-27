package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n1,n2,n3;
        int maior,menor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza o 1º número: ");
        n1 = scanner.nextInt();

        System.out.println("Introduza o 2º número: ");
        n2 = scanner.nextInt();

        System.out.println("Introduza o 3º número: ");
        n3 = scanner.nextInt();

        maior = n1;
        menor = n1;

        if(maior<n2)	{
            maior = n2;
        }
        if(maior<n3)	{
            maior = n3;
        }
        if(menor>n2)	{
            menor = n2;
        }
        if(menor>n3)	{
            menor = n3;
        }


        System.out.println("O maior número é o: "+maior);
        System.out.println("O menor número é o: "+menor);

        scanner.close();

    }
}
