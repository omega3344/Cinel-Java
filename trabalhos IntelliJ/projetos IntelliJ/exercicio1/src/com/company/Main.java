package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double enc1,enc2,enc3,enctotal;
        double valor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza o peso da 1ª encomenda:");
        enc1 = scanner.nextDouble();

        System.out.println("Introduza o peso da 2ª encomenda:");
        enc2 = scanner.nextDouble();

        System.out.println("Introduza o peso da 3ª encomenda:");
        enc3 = scanner.nextDouble();

        enctotal=enc1+enc2+enc3;

        if(enctotal<=500)	{
            valor = (enctotal*0.5);
        }
        if((enctotal>500)&&(enctotal<=600))	{
            valor = ((enctotal-500)*5)+(enctotal*0.5);
        }
        if((enctotal>600)&&(enctotal<=1000))	{
            valor = ((enctotal-500)*8)+(enctotal*0.5);
        }
        if((enctotal>1000)&&(enctotal<=1500))	{
            valor = ((enctotal-500)*10)+(enctotal*0.5);
        }
        if(enctotal>1500)	{
            valor = ((enctotal-500)*15)+(enctotal*0.5);
        }

        System.out.println("O valor total a pagar é "+valor);

        scanner.close();

    }

}
