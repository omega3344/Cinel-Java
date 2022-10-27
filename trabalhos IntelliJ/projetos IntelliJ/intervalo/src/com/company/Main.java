package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza um número: ");
        a = scanner.nextInt();

        if((a>=50)&&(a<=100)) {
            System.out.println("O número "+a+" está dentro do intervalo");
        }
        else	{
            System.out.println("O número "+a+" está fora do intervalo");
        }

        scanner.close();

    }
}
