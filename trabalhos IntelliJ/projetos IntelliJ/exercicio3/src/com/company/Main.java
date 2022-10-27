package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sala;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a sala do cinema (1 a 6):");
        sala = scanner.nextInt();

        switch(sala)	{
            case 1:
                System.out.println("Exterminador Implacável");
                break;
            case 2:
                System.out.println("Pulp Fiction");
                break;
            case 3:
                System.out.println("O Padrinho");
                break;
            case 4:
                System.out.println("Titanic");
                break;
            case 5:
                System.out.println("Avatar");
                break;
            case 6:
                System.out.println("Matrix");
                break;
        }

        scanner.close();

    }

}

