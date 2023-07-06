package Do;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cont, n;

        cont = 0;

        do {
            System.out.print("Digite um numero : ");
            n = sc.nextInt();
            cont = cont + 1;
        }while (n > 0);







    }
}
