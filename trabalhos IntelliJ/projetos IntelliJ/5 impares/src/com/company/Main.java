package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[5];
        int b;

        Scanner scanner = new Scanner(System.in);

        for (b=0;b<5;b++)  {
            System.out.println("Introduza o "+(b+1)+"º número: ");
            a[b] = scanner.nextInt();
        }

        for (b=0;b<5;b++)  {
            if((a[b])%2!=0) {
                System.out.println("O número "+a[b]+" é ímpar");
            }
        }

        scanner.close();

    }

}


