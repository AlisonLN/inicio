package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cc;

        cc = 0;

        while (cc < 10){
          cc =  cc + 1 ;
            if (cc == 5 || cc == 7 || cc == 9){
                continue;
            }
            System.out.println("Camabalhota " + cc);
        }

    }
}
