package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int inicio,fim;


        System.out.print("Digite o Valor Inicial : ");
        inicio = sc.nextInt();
        System.out.print("Digite o Valor Final : ");
        fim = sc.nextInt();

        while (inicio > fim || inicio < fim ){
            System.out.print(  "..." + inicio );
            if (inicio > fim) {
                inicio = inicio - 1;
            } else if (inicio < fim){
                inicio = inicio + 1;
            }
            }
        }





    }


