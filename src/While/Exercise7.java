package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double real,dollar;
        int quant,cont;

        System.out.print("Quantas Vezes Deseja Converter : ");
        quant = sc.nextInt();
        cont = 1;

        while (cont <= quant){
            System.out.print("Quantos Real Voce Quer Converter : ");
            real = sc.nextDouble();
            dollar = real / 4.79;
            cont = cont + 1;
            System.out.printf("Você Tera U$$: %.2f\n" , dollar);
        }


    }
}
