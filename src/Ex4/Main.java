package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *  Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números.
         * */

        float num1, num2, num3, num4, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextFloat();

        System.out.println("Digite o segundo numero");
        num2 = scanner.nextFloat();

        System.out.println("Digite o terceiro numero");
        num3 = scanner.nextFloat();

        System.out.println("Digite o quarto numero");
        num4 = scanner.nextFloat();

        media = (num1 + num2 + num3 + num4) / 4;

        System.out.println("A media aritmetica eh "+ media);
    }
}
