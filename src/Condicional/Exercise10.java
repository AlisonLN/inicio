package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome;
        int dep;
        double salario,novosalario;

        System.out.print("Nome : ");
        nome = sc.nextLine();
        System.out.print("Salario : ");
        salario = sc.nextInt();
        System.out.print("Quantidade Dependentes : ");
        dep = sc.nextInt();


        switch (dep){
            case 0:
                novosalario = (salario * 0.05) + salario;
                break;
            case 1,2,3:
                novosalario = (salario * 0.10) + salario;
                break;
            case 4,5,6:
                novosalario = (salario * 0.15) + salario;
                break;
            default:
                novosalario = (salario * 0.18) + salario;
                break;
        }
        System.out.println("------------Salaraio Atualizado---------------");
        System.out.println("Novo Salario De " +nome+ " é de " + novosalario);


    }
}
