package Do;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cont;

        cont = 10;

        do {                            // repitaa
            System.out.println(cont);
            cont = cont - 1;
        }   while (cont >= 0) ; // enquanto o cont for menor igual a 10



    }
}
