package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { // o extends está dizendo que a Classe Filme irá extender(Herdar) todos os atributos e metodos da classe Titulo
    // A classe especifica o conteúdo de um Objeto
    private String diretor;

    public String getDiretor(){
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Fime: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
