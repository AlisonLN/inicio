package For;

import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        int i, a, b, aux;

        a = 1;
        b = 0;

        for (i = 0; i < 15; i++){
            System.out.print(a + " ");
            aux = a;
            a = a + b;
            b = aux;

        }

    }
}
