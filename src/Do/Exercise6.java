package Do;

import java.io.BufferedReader;
import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cont, num, nprimo,resp;

        do {


            System.out.print("Digite Um Numero : ");
            num = sc.nextInt();

            cont = 1;
            nprimo = 0;

            do {
                if (num % cont == 0) {
                    nprimo = nprimo + 1;
                }
                cont = cont + 1;
            } while (cont <= num);
            if (nprimo > 2) {
                System.out.print("O Numero " + num + " Não é Primo ");
            } else {
                System.out.print("O Numero " + num + " è Primo ");
            }

            System.out.println("\nEste Numero possui " + nprimo + " Divisores");
            System.out.println("---------------------------------------");
            System.out.print("Deseja Continuar ? 1=S / 2=N : ");
            resp = sc.nextInt();
        }while (resp == 1);


    }
}
