package DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite Sua Senha : ");
        int senha = sc.nextInt();


        while (senha != 2002) {
            System.out.println("Senha Incorreta");
            System.out.print("Digite Sua Senha : ");
            senha = sc.nextInt();
            }
                System.out.println("Senha Correta ");

    }
}