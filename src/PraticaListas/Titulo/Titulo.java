package PraticaListas.Titulo;
/*
Crie uma classe Titulo com um atributo nome do tipo String.
Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.
 */
public class Titulo implements Comparable<Titulo>{
    private String nome;
    public Titulo(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public int compareTo(Titulo otherTitulo) {
        return this.getNome().compareTo(otherTitulo.getNome());
    }
}
