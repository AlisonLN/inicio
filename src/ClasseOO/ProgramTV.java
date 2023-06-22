package ClasseOO;

import intities.ProductTV;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTV {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProductTV productTV = new ProductTV();

        System.out.println("Enter Product Data : ");
        System.out.print("Name : ");
        productTV.name = sc.nextLine();
        System.out.print("Price : ");
        productTV.price = sc.nextDouble();
        System.out.print("Quantity In Stock : ");
        productTV.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product Data : " + productTV.toString());

        System.out.println();
        System.out.print("Enter the number of products to be added in stock : ");
        int quant = sc.nextInt(); // criou uma variavel quant
        productTV.addProduct(quant); // essa variavel criada foi adicionada no metododo para aumentar o  produto em stock,faz a atualizacao

        System.out.println();
        System.out.println("Update data : " + productTV.toString());

        System.out.println();
        System.out.print(" Enter the number of products to be removed in stock : ");
        quant = sc.nextInt();
        productTV.removeProduct(quant);

        System.out.println();
        System.out.println("Update data : " + productTV.toString());






    }

}
