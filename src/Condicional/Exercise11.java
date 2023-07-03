package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double nota1,nota2,media;

        System.out.print("Digite Nota 1 : ");
        nota1 = sc.nextDouble();
        System.out.print("Digite Nota 2 : ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Média : " + media);

        if (media > 9){
            System.out.println("Aproveitamento : A");
            } else if (media > 8 ){
              System.out.println("Aproveitamento : B");
                } else if (media > 7){
                  System.out.println("Aproveitamento : C ");
                    } else if (media > 6){
                      System.out.println("Aproveitamento : D ");
                        } else if (media > 5 ){
                          System.out.println("Aproveitamento : E ");
                            } else {
                              System.out.println("Aproveitamento : F ");
                                }


    }
}
