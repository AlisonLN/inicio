package intities;

public class Usuario {

    public String nome;
    public String endereco;
    public String telefone;
    public String cpf;

    @Override
    public String toString() {
        return
                "Nome = " + nome + "\n" +
                "Endereco = " + endereco + " \n " +
                "Cpf = " + cpf + " \n " +
                "Telefone = " + telefone + " \n " ;
    }
}
