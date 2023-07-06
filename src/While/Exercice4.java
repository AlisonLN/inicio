package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cont,n;

        cont = 1;

        while (cont <= 10){
            System.out.print("Digite o  Numero : ");
            n = sc.nextInt();
            cont = cont + 1;
        }
        System.out.println("Terminei De Contar ! ");

    }
}
