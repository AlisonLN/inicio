package While;

import java.util.Locale;
import java.util.Scanner;

public class Exericese1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int contador;


        contador = 10;

        while (contador > 0 ){
            System.out.println(contador);
            contador = contador -1;
        }
        System.out.println("Termineir de Contar");
    }
}
