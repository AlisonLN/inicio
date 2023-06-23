package Inicio;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//        decimais.
public class Exercise5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double id,horasTrabalhadas,valorHoras,salario;


        System.out.print("Digite ID Funcionario: ");
        id = sc.nextDouble();
        System.out.print("Digite Quantidade de Horas Trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();
        System.out.print("Digite Valor Horas: ");
        valorHoras = sc.nextDouble();

        salario = valorHoras * horasTrabalhadas;

        System.out.printf("Funcionario: %.0f%n " , id);
        System.out.printf("Salary = U$ %.2f" , salario);



//        Professor Fez

//        int numero, horas;
//        double valorHora, salario;
//
//        numero = sc.nextInt();
//        horas = sc.nextInt();
//        valorHora = sc.nextDouble();
//
//        salario = valorHora * horas;
//
//        System.out.println("NUMBER = " + numero);
//        System.out.printf("SALARY = U$ %.2f%n", salario);


    }

}
