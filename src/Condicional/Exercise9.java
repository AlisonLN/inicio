package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double imc, massa, altura;


        System.out.print("Digite sua massa: ");
        massa = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();

        imc = massa / (altura * altura);

        System.out.printf("Seu IMC = %.2f\n", imc);

        if (imc > 18.5 && imc < 25) {
            System.out.println("Peso Ideal");
        } else if (imc < 17) {
            System.out.println("Muito Abaixo do Peso");
        } else if (imc > 17 && imc < 18) {
            System.out.println("Abaixo Do Peso");
        } else if (imc > 25 && imc < 30) {
            System.out.println("SobrePeso");
        } else if (imc > 30 && imc < 35) {
            System.out.println("Obesidade");
        } else if (imc > 35 && imc < 40) {
            System.out.println("Obesidade Severa");
        } else if (imc > 40) {
            System.out.println("Obesidade Morbida");
        }

    }
}

