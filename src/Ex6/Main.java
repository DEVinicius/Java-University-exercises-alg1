package Ex6;

import java.util.Scanner;

public class Main {
    /*
    * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
calcular e imprimir o total a receber no final do mês.
    * */

    public static void main(String[] args) {
        String nomeVendedor;
        float salarioFixo, totalVendasMes;
        double salarioFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedeor: ");
        nomeVendedor = scanner.next();

        System.out.println("Digite o salario fixo do " + nomeVendedor);
        salarioFixo = scanner.nextFloat();

        System.out.println("Digite o total de vendas no mes (em dinheiro R$) ");
        totalVendasMes = scanner.nextFloat();

        salarioFinal = salarioFixo + (0.15 * totalVendasMes);

        System.out.println("O Salario final que o " + nomeVendedor + " vai receber será de R$ " + salarioFinal);


    }
}
