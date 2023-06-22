package ClasseOO;

import intities.Biblioteca;
import intities.Livro;
import intities.Usuario;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        Usuario usuario = new Usuario();
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro();
        livro.setTitulo("cronicas de narnia");
        Livro livro1 = new Livro();
        livro1.setTitulo("igreja notaveis");
        Livro livro2 = new Livro();
        livro2.setTitulo("cura do limao");
        Livro livro3 = new Livro();
        livro3.setTitulo("biblia");
        Livro livro4 = new Livro();
        livro4.setTitulo("lideranca");
        Livro livro5 = new Livro();
        livro5.setTitulo("Paulo");
        Livro livro6 = new Livro();
        livro6.setTitulo("salmos");
        Livro livro7 = new Livro();
        livro7.setTitulo("JBL");
        Livro livro8 = new Livro();
        livro8.setTitulo("Dominical");
        Livro livro9 = new Livro();
        livro9.setTitulo("Evoluindo Sem Uso de Esteroide");

        List<Livro> listaDeLivros = new ArrayList<>();

        listaDeLivros.add(livro);
        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);
        listaDeLivros.add(livro4);
        listaDeLivros.add(livro5);
        listaDeLivros.add(livro6);
        listaDeLivros.add(livro7);
        listaDeLivros.add(livro8);
        listaDeLivros.add(livro9);

        biblioteca.setListaLivro(listaDeLivros);

        System.out.println("Cadastro Usuario");
        System.out.print("Nome : ");
        usuario.nome = sc.nextLine();
        System.out.print("Endereço : ");
        usuario.endereco = sc.nextLine();
        System.out.print("CPF : ");
        usuario.cpf = sc.nextLine();
        System.out.print("Telefone : ");
        usuario.telefone = sc.nextLine();

        System.out.println("Qual Livro Voce Deseja Alugar ? ");
        int escolha = sc.nextInt();


        System.out.println(usuario.toString());

         System.out.println(listaDeLivros.get(escolha));








    }
}
