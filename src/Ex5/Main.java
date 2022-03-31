package Ex5;

import java.util.Scanner;

public class Main {
    /*
    * Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número e o
salário do funcionário.
    * */

    public static void main(String[] args) {

        int numeroFuncionario, horasTrabalhadas;
        float valorGanhoPorHora;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o numero do funcionario: ");
        numeroFuncionario = scanner.nextInt();

        System.out.println("Digite o Valor que o funcionario " + numeroFuncionario + " ganha por hora: ");
        valorGanhoPorHora = scanner.nextFloat();

        System.out.println("Quantas horas esse funcionario trabalhou no mes?");
        horasTrabalhadas = scanner.nextInt();

        System.out.println("O funcionario  "+ numeroFuncionario + " Ganhou R$ " + (horasTrabalhadas * valorGanhoPorHora) + " por ter trabalhado " + horasTrabalhadas + " horas");
    }
}
