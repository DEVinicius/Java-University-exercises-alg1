package Ex10;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        /*
        * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a
soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável
A for par escrever a mensagem "Valores aceitos", senão escrever "Valores não aceitos".
Veja abaixo alguns exemplos. Não fixe esses valores no código. Você pode usá-los para TESTAR seu
algoritmo:
        * */

        int a,b,c,d;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        a = scanner.nextInt();

        System.out.println("Digite o valor de b: ");
        b = scanner.nextInt();

        System.out.println("Digite o valor de c: ");
        c = scanner.nextInt();

        System.out.println("Digite o valor de d: ");
        d = scanner.nextInt();

        if((b > c) && (d > a) && ((c + d) > (a + b) && ((c > 0) && (d > 0)) && (a %2==0))){
            System.out.println("Valores Aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
