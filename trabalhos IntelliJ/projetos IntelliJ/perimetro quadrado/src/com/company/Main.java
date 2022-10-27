package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza o comprimento do lado do quadrado: ");
        lado = scanner.nextInt();

        System.out.println("O perímetro do quadrado é: "+lado*4);

        scanner.close();

    }
}
