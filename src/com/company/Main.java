package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	*  Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números.
     * */

        float num1, num2, multiplicacao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextFloat();

        System.out.println("Digite o segundo numero");
        num2 = scanner.nextFloat();

        multiplicacao = num1 * num2;
        System.out.println("O produto eh "+ multiplicacao);
    }
}
