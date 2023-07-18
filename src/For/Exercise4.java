package For;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int i, num;

        System.out.print("Digite Um Valor : ");
        num = sc.nextInt();

        if (num % 2 == 1){
            num = num -1;
        }


        for (i = num; i >= 0; i-=2){
            System.out.println(i);
        }




    }
}
