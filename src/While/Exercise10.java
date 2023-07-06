package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cordenada X : ");
        int x = sc.nextInt();
        System.out.print("Enter Cordenada Y : ");
        int y = sc.nextInt();


        while (x != 0 && y !=0) {
            if (x > 0 && y > 0) {
            System.out.println("Q1");

        } else if (x < 0 && y > 0){
                System.out.println("Q2");

            } else if (x < 0 && y < 0){
                System.out.println("Q3");

            } else {
                System.out.println("Q4");
            }
            System.out.print("Enter Cordenada X : ");
             x = sc.nextInt();
            System.out.print("Enter Cordenada Y : ");
             y = sc.nextInt();

        }


    }
}
