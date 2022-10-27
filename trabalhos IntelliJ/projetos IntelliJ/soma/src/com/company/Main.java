package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int soma = 0;

        Scanner scanner = new Scanner(System.in);

        do	{
            System.out.println("Introduza um número inteiro:");
            a = scanner.nextInt();
            soma = soma + a;
        }while ((a=0) || (soma=100)); {
        }

        System.out.println("A soma é "+soma);

        scanner.close();

    }

}
