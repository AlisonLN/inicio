package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int contador,valor;


        System.out.println("Contar Até Quanto : ");
        valor = sc.nextInt();

        contador = 0;


        while (contador <= valor ){
            System.out.println(contador);
            contador = contador + 1;
        }
        System.out.println("Termineir de Contar");
    }
}
