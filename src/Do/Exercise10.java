package Do;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n,s;
        String resp;

        s = 0;

        do {
            System.out.print("Digite um numero : ");
            n  = sc.nextInt();
            s = s + n;
            System.out.print("Deseja Continuar ? [S/N] : ");
            resp = sc.next();

        }while (resp.equals("S"));

        System.out.println("A Soma de todos os valores é : " + s);


    }

}
