package Ex8;

import java.util.Scanner;

public class Main {
    //Fazer um algoritmo que leia três números e imprime o maior deles.

    public static void main(String[] args) {
        double num1, num2, num3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero");
        num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro numero");
        num3 = scanner.nextDouble();

        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " eh o maior");
        } else if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " eh o maior");
        } else {
            System.out.println(num3 + " eh o maior");
        }
    }
}
