package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int pernas;

        System.out.print("Digite a Quantidade : ");
        pernas = sc.nextInt();

        switch (pernas){
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("Bipede");
                break;
            case 4:
                System.out.println("Quadrupede");
                break;
            case 6,8:
                System.out.println("Aranha");
                break;
            default:
                System.out.println("ET");

        }





    }
}
