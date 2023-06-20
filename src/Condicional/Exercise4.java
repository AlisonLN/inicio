package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double duracao,horaInicial,horaFinal;


        System.out.print("Digite Hora Inicial = ");
        horaInicial = sc.nextDouble();
        System.out.print("Digite Hora Final = ");
        horaFinal = sc.nextDouble();

        if (horaInicial < horaFinal){
            duracao = horaInicial - horaFinal ;
        }
        else{
            duracao = 24 -  horaInicial + horaFinal;
        }

        System.out.println("O Jogo Durou " + duracao + " HORA(S) ");
    }
}
