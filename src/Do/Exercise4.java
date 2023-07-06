package Do;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int qunt, n, cont, negativo;

        System.out.print("Quantos Numeros : ");
        qunt = sc.nextInt();
        System.out.println("-------------------------------------");

        cont = 0;
        negativo = 0;

        do {
            System.out.print("Digite um numero : ");
            n = sc.nextInt();
            cont = cont + 1;
            if (n < 0){
                negativo = negativo + 1;
            }
        }while (cont < qunt);

        System.out.println(" Foram Digitados " + negativo+ " Valores Negativos");
    }

}
