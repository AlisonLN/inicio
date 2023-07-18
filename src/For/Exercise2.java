package For;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int i, soma,num;
        soma = 0;

        for (i = 0; i <= 5; i++){
            System.out.print("Digite um valor : ");
            num = sc.nextInt();
            soma = soma + num;
        }
        System.out.println("A soma de todos os numeros é " + soma);

    }
}
