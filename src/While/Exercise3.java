package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int contador,valor,salto;

        System.out.print("Até Quanto Contar ? ");
        valor = sc.nextInt();
        System.out.print("Qual Valor Do Salto ? ");
        salto = sc.nextInt();

        contador = 0;

        while (contador <= valor){
            System.out.println(contador);
            contador = contador + salto;
        }


    }
}
