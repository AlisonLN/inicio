package For;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int i,num;

        System.out.print("Digite um Numero : ");
        num = sc.nextInt();


        for (i = 0; i < num; i+=2){
            System.out.println(i);
        }



    }
}
