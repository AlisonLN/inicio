package Inicio;//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite Valor 1 : ");
        int valor1 = sc.nextInt();
        System.out.print("Digite Valor 2 : ");
        int valor2 = sc.nextInt();
        int soma = valor1 + valor2;

        System.out.println("SOMA = " + soma);
    }


}
