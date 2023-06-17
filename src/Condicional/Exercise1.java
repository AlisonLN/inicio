package Condicional;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um Numero Inteiro : ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Este numero é negativo  ");
        }else {
            System.out.println("Este numero é positivo  ");
        }
















            }


}
