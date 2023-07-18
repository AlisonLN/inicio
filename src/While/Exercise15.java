package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cc;

        cc = 0;


        while (cc < 10){
           cc =  cc + 1;
           if (cc == 4 || cc == 5 || cc == 9){
               continue;
           }if (cc == 7){
               break;
            }
            System.out.println("Cambalhota " + cc);

        }

    }
}
