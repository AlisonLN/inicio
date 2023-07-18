package Do;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cabelo,sexo,masculino,feminino,cabeloPreto,
        cabeloCastanho, cabeloLoiro, cabeloRuivo,idade;
        int hmaioridade,entreidade,hentreidade,fmaioridade;
        String resp;

        fmaioridade = 0;
        hmaioridade = 0;
        entreidade = 0;
        hentreidade = 0;

        cabeloPreto = 0;
        cabeloCastanho = 0;
        cabeloLoiro = 0;
        cabeloRuivo = 0;
        masculino = 0;
        feminino  = 0;
do {


    System.out.print("Qual Seu Sexo 1 = M / 2 = F : ");
    sexo = sc.nextInt();

    if (sexo == 1) {
        masculino = masculino + 1;
    } else if (sexo == 2) {
        feminino = feminino + 1;

    }

    System.out.print("Qual Sua Idade : ");
    idade = sc.nextInt();

            if (sexo == 1 && idade > 18 && idade < 25) {
            hmaioridade = hmaioridade + 1;
              } else if (sexo == 2 && idade > 18 && idade < 25){
                fmaioridade = fmaioridade + 1;
    } else if (sexo == 2 && idade > 25 && idade < 30){
        entreidade = entreidade + 1;
    } else if (sexo == 1 && idade > 25 && idade < 30 ){
        hentreidade = hentreidade + 1;

    }

    System.out.println("================");
    System.out.println("   Cor Cabelo   ");
    System.out.println("[1] Preto ");
    System.out.println("[2] Castanho");
    System.out.println("[3] Loiro");
    System.out.println("[4] Ruivo \n     :  ");
    cabelo = sc.nextInt();

        if (cabelo == 1) {
            cabeloPreto = cabeloPreto + 1;
        } else if (cabelo == 2) {
            cabeloCastanho = cabeloCastanho + 1;
        } else if (cabelo == 3) {
            cabeloLoiro = cabeloLoiro + 1;
        } else if (cabelo == 4) {
            cabeloRuivo = cabeloRuivo + 1;
        }



    System.out.print("Deseja Continuar ? [S/N] : ");
    resp = sc.next();
        }while (resp.equals("s")) ;

        System.out.println("Total de homens com mais de 18 e cabelos castanho  é " + cabeloCastanho);
        System.out.println("Total de mulheres com idade entre 25 e 30 e cabelos loiros é " + cabeloLoiro);
        System.out.println("masculino : " +  masculino);
        System.out.println("Feminino : " +  feminino);
        System.out.println("Homem Maior de 18 : " + hmaioridade);
        System.out.println("Mulher Maior de 18 : " + fmaioridade);
        System.out.println("Mulheres Entre 25 e 30 : " + entreidade);
        System.out.println("Homens Entre 25 e 30 : " + hentreidade);
        System.out.println("Cabelo Preto " + cabeloPreto);
        System.out.println("Cabelo Ruivo " + cabeloRuivo);

    }

}