package Condicional;

import java.util.Locale;
import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//        ordem crescente ou decrescente
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a,b;

        System.out.print("Digite o numero A : ");
        a = sc.nextInt();
        System.out.print("Digite o numero B : ");
        b = sc.nextInt();

        if (a  % b == 0 || b % a == 0){
            System.out.println("São Mutiplos");
        }
        else {
            System.out.println("Nao é Mutiplos");
        }



    }
}
