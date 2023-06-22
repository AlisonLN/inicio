package Condicional;

import java.util.Locale;
import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//        seguir, calcule e mostre o valor da conta a pagar
    public class Exercise5 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double codig,quant;


            System.out.print("Enter the codig of product : ");
            codig = sc.nextDouble();
            System.out.println("Deseja Pedir outro Produto ? ");

            System.out.print("Enter the quantity of product : ");
            quant = sc.nextDouble();


            double total = 0;
            if(codig == 1){
                System.out.println("Cachoro Quente R$ 4.00 und ");
                total = quant * 4.00;
            }
            else if (codig == 2){
                System.out.println("X-Salada R$ 4.50 und ");
                total = quant * 4.50;
            }
            else if (codig == 3) {
                System.out.println("X-Bacon R$ 5.00 und ");
                total = quant * 5.00;
            }
            else if (codig == 4) {
                System.out.println("Torrrada Simples R$ 2.00 und ");
                total = quant * 5.00;
            }
            else if (codig == 5) {
                System.out.println("X-Bacon R$ 1.50 und ");
                total = quant * 1.50;
            }


            System.out.println("R$ " + total + " TOTAL " );
        }
    }


