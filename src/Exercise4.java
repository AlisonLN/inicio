
//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a,b,c,d,diferanca;

        System.out.print("Digite o Valor de A = ");
        a = sc.nextInt();
        System.out.print("Digite o Valor de B = ");
        b = sc.nextInt();
        System.out.print("Digite o Valor de C = ");
        c = sc.nextInt();
        System.out.print("Digite o Valor de D = ");
        d = sc.nextInt();

        diferanca = a * b - c * d;


        System.out.print("Diferenca = " + diferanca);

    }
}