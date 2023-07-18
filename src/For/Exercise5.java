package For;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int i, num, tot010,impar,numimpar;


        numimpar = 0;
        tot010 = 0;
        impar = 0;


        for (i = 1; i <= 6; i++){
            System.out.print("Digite um Valor : ");
            num = sc.nextInt();
            if (num >= 0 && num <= 10) {
                tot010 = tot010 + 1;
            }
                if (num > 0 && num % 2 == 1) {
                    impar = impar + num;
                }
//            if (num > 10){ se nao quiser usar a estrutura de cima  incluindo o && da certo usar essa separadamente
//                impar = impar + num; preste sempre atencao nos fechamentos dos colchetes para nao se perder nos lacos
//            } e os valores derem errado


            if (num % 2 ==1) {
                numimpar = numimpar + 1;

            }
        }



        System.out.println("Foi digitado " + tot010 + " numeros entre 0 e 10");
        System.out.println("A Soma dos numero impares é  " + impar);
        System.out.println("Total de numeros impares digitados " + numimpar);

    }
}
