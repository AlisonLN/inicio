package Do;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cont,n,tabuada;

        System.out.print("Qual Tabuada : ");
        n = sc.nextInt();

        cont = 0;
        tabuada = 0;

        do {
            tabuada = n * cont;
            System.out.println(n+ " X " +cont +" = "+ tabuada);

            cont = cont + 1;
        }   while (cont <= 10) ;



    }
}









