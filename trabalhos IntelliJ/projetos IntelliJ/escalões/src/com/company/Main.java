package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza a idade do jogador: ");
        a = scanner.nextInt();

        if((a>10)&&(a<=17))	{
            System.out.println("O jogador é do escalão Juvenil");
        }
		else	{
            if(a<=10)	{
                System.out.println("O jogador é do escalão Infantil");
            }
            else	{
                System.out.println("O jogador é do escalão Sénior");
            }
        }

        scanner.close();

    }
}
