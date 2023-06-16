import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//        casas decimais conforme exemplos.
//        Fórmula da área: area = π . raio2
//        Considere o valor de π = 3.14159
public class Exercise3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Digite o Valor do Raio = ");
        double raio = sc.nextDouble();

        double area = pi * raio * raio;

        System.out.printf("150Area Do Circulo = %.4f",area);



        // Professor Fez :


//        double R, A, pi = 3.14159;
//
//        R = sc.nextDouble();
//
//        A = pi * R * R;
//
//        System.out.printf("A=%.4f%n", A);
//
//
    }
}
