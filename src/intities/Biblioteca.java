package intities;

import java.util.List;

public class Biblioteca {

 private List<Livro> listaLivro;

    public List<Livro> getListaLivro() {
        return listaLivro;
    }

    public void setListaLivro(List<Livro> listaLivro) {
        this.listaLivro = listaLivro;
    }

    public Livro alugarLivro(String tituloLivro){
        for( int i = 0; i < listaLivro.size(); i++){
            if(listaLivro.get(i).getTitulo().equals(tituloLivro)){
            return listaLivro.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLivro=" + listaLivro +
                '}';
    }
}
