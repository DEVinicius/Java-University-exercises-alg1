package Ex9;

import java.util.Scanner;

public class Main {
    // Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor.

    public static void main(String[] args) {
        double num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero");
        num2 = scanner.nextDouble();

        if(num1 > num2 ) {
            System.out.println("A divisao do maior pelo menor eh: " + num1 + "/" + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("A divisao do maior pelo menor eh: " + num2 + "/" + num1 + " = " + (num2 / num1));
        }
    }
}
