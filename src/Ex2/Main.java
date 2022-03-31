package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *  Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado
de um número A é representado por A2 = A * A.
         * */

        float num1, num2;
        double somaQuadrados;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextFloat();

        System.out.println("Digite o segundo numero");
        num2 = scanner.nextFloat();

        somaQuadrados = Math.pow(num1, 2) + Math.pow(num2, 2);
        System.out.println("A soma dos quadrados eh "+ somaQuadrados);
    }
}
