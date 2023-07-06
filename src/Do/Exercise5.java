package Do;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n, cont,fatorial;

        System.out.print("Digite um numero Fatorial : ");
        n =  sc.nextInt();

        cont = n;
        fatorial = 1;

        do {
            fatorial = fatorial * cont;
            System.out.print(cont + " X...");
            cont = cont - 1;
        }while (cont > 0);
        System.out.println("\nO Valor Fatorial de " + n+ " é igual a " + fatorial);
    }

}
