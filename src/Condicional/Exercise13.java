package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int timeA, timeB, diferenca;


        System.out.print("Quantos Gol Time A : ");
        timeA = sc.nextInt();
        System.out.print("Quantos Gol Time B : ");
        timeB = sc.nextInt();

        diferenca = (timeA - timeB) * -1;

        System.out.println("--------------------");
        System.out.println("Diferença : " + diferenca);


        switch (diferenca){
            case 0:
                System.out.println("Empate");
                break;
            case 1,2,3:
                System.out.println("Partida Normal");
                break;
            default:
                System.out.println("Goleada");
                break;
        }

    }
}