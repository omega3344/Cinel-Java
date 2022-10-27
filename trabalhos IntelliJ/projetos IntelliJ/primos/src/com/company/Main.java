package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c,d,p;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique o início do intervalo:");
        a = scanner.nextInt();

        System.out.println("Indique o fim do intervalo:");
        b = scanner.nextInt();

        for (c=a;c<=b;c++)  {
            p=0;
            for (d=1;d<=c;d++) {
                if (c % 2 == 0) {
                    p++;
                }
            }
            if(p==2)	{
                System.out.println("O número "+c+" é primo");
            }
        }

        scanner.close();

    }

}
