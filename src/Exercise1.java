import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor
//do metro quadrado do terreno com duas casas decimais.Em seguida, o programa deve mostrar o valor da area do terreno, vem como o valor
//do preco do terreno, ambos com duas casas decimais.
public class Exercise1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        double largura,comprimento,area,preco;
//        double metrosQuadrado = 200.00;
//
//        System.out.print("Digite a largura do terreno : ");
//        largura = sc.nextDouble();
//        System.out.print("Digite o comprimento do terreno : ");
//        comprimento =  sc.nextDouble();
//        area =  (largura * comprimento) ;
//        System.out.printf(" Area = %.2f%n", area);
//        preco = area * metrosQuadrado;
//        System.out.printf("Preco = %.2f", preco);
//

        // Como o professor queria


        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metrosQuadrados = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metrosQuadrados;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Preco = %.2f%n", preco);

        }
    }
