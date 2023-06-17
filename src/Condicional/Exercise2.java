package Condicional;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpa
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um numero Inteiro : ");
        int num = sc.nextInt();

        if (num % 2  == 0){
            System.out.println("Numero é Par ");
        }else {
            System.out.println("Numero é Impar");
        }









    }
}
