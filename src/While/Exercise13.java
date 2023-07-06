package While;

import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String aluno,nomemaiornota = "";
        double nota,maior,menor;
        int contador,quantaluno;
        String nomemenornota = "";


        System.out.print("Quantos Alunos A Classe Tem : ");
        quantaluno = sc.nextInt();


        contador = 0;
        maior = 0;
        menor = 11;

        while (contador < quantaluno){
            System.out.print("Digite Nome Do Aluno : ");
            aluno = sc.next();
            System.out.print("Digite Nota De " + aluno + " : ");
            nota = sc.nextDouble();
            System.out.println("-----------------------------");
            contador = contador + 1;
            if (nota > maior ){
                maior = nota;
                nomemaiornota = aluno;
            } else if (nota < menor){
                menor = nota;
                nomemenornota = aluno;
            }
        }

        System.out.println("O Melhor Aproveitamento Foi de " + nomemaiornota + " Com a Média de : " + maior );
        System.out.println("O  Pior  Aproveitamento Foi de " + nomemenornota + " Com A Média de : " + menor );
    }
}
