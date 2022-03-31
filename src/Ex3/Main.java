package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *  Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. (Por
exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2. –8 é consecutivo
de –9)
         * */

        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        num2 = scanner.nextInt();

        System.out.println("Os numeros consecutivos sao "+ (num1 + 1) + " e " + (num2 + 1));
    }
}
