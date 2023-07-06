package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cont,n,soma,maior;

        cont = 1;
        soma = 0;
        maior = 0;

        while (cont <= 10) {
            System.out.print("Digite um numero : ");
            n = sc.nextInt();
            cont = cont + 1;
            soma = soma + n;
            if (n > maior) {
                maior = n;
            }
        }
        System.out.println(" A soma de todos os numeros : " + soma);
        System.out.println(" O Maior Numero Digitado foi : " + maior);






    }
}
