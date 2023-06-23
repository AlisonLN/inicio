package Inicio;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo,quant,codigo1,quant1;
        double valor,valor1,valorTotal;

        System.out.print("Digite Codigo Peca: ");
        codigo = sc.nextInt();
        System.out.print("Digite Quantidade: ");
        quant = sc.nextInt();
        System.out.print("Valor Unitario Peca: ");
        valor = sc.nextDouble();

        System.out.print("Digite Quantidade: ");
        quant1 = sc.nextInt();
        System.out.print("Digite Codigo Peca: ");
        codigo1 = sc.nextInt();
        System.out.print("Valor Unitario Peca: ");
        valor1 = sc.nextDouble();

        valorTotal = (quant * valor) + (quant1 * valor1);

        System.out.println("Valor a Pagar = " + valorTotal);



        //Professor Fez
//
//        int cod1, cod2, qte1, qte2;
//        double preco1, preco2, total;
//
//        cod1 = sc.nextInt();
//        qte1 = sc.nextInt();
//        preco1 = sc.nextDouble();
//
//        cod2 = sc.nextInt();
//        qte2 = sc.nextInt();
//        preco2 = sc.nextDouble();
//
//        total = preco1 * qte1 + preco2 * qte2;
//
//        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);







    }
}
