package For;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int c1,c2;


        for (c1 = 1; c1 <= 3; c1++) {
            for (c2 = 1; c2 <= 3; c2++) {
                System.out.println(c1+" "+c2);
            }
        }


    }
}
