package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int anonasc,anoatual,idade;

        System.out.print("Qual Ano Voce Nasceu : ");
        anonasc = sc.nextInt();
        System.out.print("Em Que Ano Estamos : ");
        anoatual = sc.nextInt();

        idade = anoatual - anonasc;

        System.out.println("Sua Idade é " + idade);


        if (idade < 16 ){
            System.out.println("Nao Vota");
        } else if (idade >= 16 && idade < 18 || idade > 70){
            System.out.println("Seu Voto é Opcional");
        } else
            System.out.println("Você é obrigado a Votar");

    }
}
