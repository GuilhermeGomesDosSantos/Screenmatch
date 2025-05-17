package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo{ // o extends está dizendo que a Classe Filme irá extender(Herdar) todos os atributos e metodos da classe Titulo
    // A classe especifica o conteúdo de um Objeto
    private String diretor;

    public String getDiretor(){
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
}
