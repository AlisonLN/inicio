package Do;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n, cont, fatorial;
        int resp = 0;


        do {


            System.out.print("Digite um numero Fatorial : ");
            n = sc.nextInt();

            cont = n;
            fatorial = 1;

            do {
                fatorial = fatorial * cont;
                System.out.print(cont + " X...");
                cont = cont - 1;
            } while (cont > 0);
            System.out.println("\nO Valor Fatorial de " + n + " é igual a " + fatorial);
            System.out.print("Quer Continuar ? 1=S / 2=N : ");
            resp = sc.nextInt();
        } while (resp == 1); // repita enquanto a resp for igual a 1 caso contrario encerre o programa

    }

}
