package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double preco;
        double litros;
        double valor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza o preço por litro: ");
        preco = scanner.nextDouble();

        System.out.println("Introduza a quantidade de litros: ");
        litros = scanner.nextDouble();

        valor = preco*litros;

        System.out.println("O valor a pagar é: "+valor);

        scanner.close();

    }
}
