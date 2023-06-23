package DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite Valor X : ");
        int x = sc.nextInt();
        System.out.print("Digite Valor Y : ");
        int y = sc.nextInt();

        while (x != y ) {
            if (x < y) {
                System.out.println("Crescente");
            }
            else {
                System.out.println("Decrecente");
            }

            System.out.print("Digite Valor X : ");
            x = sc.nextInt();
            System.out.print("Digite Valor Y : ");
            y = sc.nextInt();
        }




    }
}
