package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary,imposto;

        System.out.print("Valor Salario : ");
         salary = sc.nextDouble();



        if (salary < 2000.00){
            System.out.print("Isento");
        } else if ( salary <= 3000.00){
            imposto = (salary - 2000.00) * 0.08;
            System.out.println("Imposto a ser pago : R$ " + imposto);
        } else if ( salary <= 4500.00){
            imposto = (salary - 3000) * 0.18 + 1000 * 0.08;
            System.out.println("Imposto a ser pago : R$ " + imposto);
        }else {
            imposto = (salary - 4500) * 0.28 + (1500 * 0.18) + 1000 * 0.08;
            System.out.println("Imposto a ser pago : R$ " + imposto);
        }

    }

}
