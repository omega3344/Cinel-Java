package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a,b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza um número: ");
        a = scanner.nextInt();
        b=1;

        do	{
            System.out.println(a+" X "+b+" = "+(a*b));
            b++;
        } while (b<11);

        scanner.close();
    }
}
