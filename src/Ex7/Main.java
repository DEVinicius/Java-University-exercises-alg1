package Ex7;

import java.util.Scanner;

public class Main {
    /*
    * Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a
mensagem "Numero negativo".
    * */

    public static void main(String[] args) {
        double numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = scanner.nextDouble();

        if(numero < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero positivo");
        }
    }
}
