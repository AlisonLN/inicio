package For;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int vezes,i,num,soma,numdiv,nulo,pares,media;

        soma = 0;
        media = 0;
        numdiv = 0;
        nulo = 0;
        pares = 0;


        System.out.print("Quantas vezes ? : ");
       vezes = sc.nextInt();

       for (i = 1; i <= vezes; i++){
           System.out.println("Digite um numero");
           num = sc.nextInt();
           soma = soma + num;
           media = soma / vezes;
           if (num % 5 == 0){
               numdiv = numdiv + 1;
           }
           if (num <= 0){
               nulo = nulo + 1;
           }
           if (num % 2 == 0){
               pares = pares + num;
           }




       }
        System.out.println("A Soma entre os valores é " + soma);
        System.out.println("A Média entre os valores é " + media);
        System.out.println("Valores divididos por cinco é " + numdiv);
        System.out.println("Valores Nulos são " + nulo);
        System.out.println("A soma dos valores pares " + pares);



    }
}
