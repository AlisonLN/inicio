package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.print("Oque Deseja Abastecer : ");
        int cod = sc.nextInt();


        while (cod < 4){
            if (cod == 1){
                alcool = alcool + 1;
            } else if (cod == 2) {
                gasolina = gasolina + 1;
            } else if (cod == 3) {
                diesel = diesel + 1;
            }
            System.out.print("Oque Deseja Abastecer : ");
            cod = sc.nextInt();
        }

        System.out.println("Muito Obrigado");
        System.out.println("Alcool : " + alcool);
        System.out.println("Gasolina : " + gasolina);
        System.out.println("Diesel : " + diesel);

    }
}




