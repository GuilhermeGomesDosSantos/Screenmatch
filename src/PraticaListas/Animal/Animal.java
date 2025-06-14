package PraticaListas.Animal;

/*
Crie uma classe Animal e uma classe Cachorro que herda de Animal.
Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
*/
public class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String especie;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

}
