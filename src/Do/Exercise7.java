package Do;

import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int contneg, cont, escolha;
do {


    System.out.println("\n=================");
    System.out.println("|      MENU     |");
    System.out.println("=================");
    System.out.println("| [1] De 1 a 10 |");
    System.out.println("| [2] De 10 a 1 |");
    System.out.println("| [3] Sair      |");
    System.out.println("=================");

    cont = 1;
    contneg = 10;

    escolha = sc.nextInt();

    switch (escolha) {
        case 1:
            do {
                System.out.print(cont + " ");
                cont = cont + 1;
            } while (cont <= 10);

            break;

        case 2:
            do {
                cont = 10;
                System.out.print(contneg + " ");
                contneg = contneg - 1;
            } while (contneg >= 1);

            break;
        case 3:
            System.out.println("Saindo...");
            break;
        default:
            System.out.println("Opcao Invalida");
    }
        }while (escolha < 3);

    }
}
