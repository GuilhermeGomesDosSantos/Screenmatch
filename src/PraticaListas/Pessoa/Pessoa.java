package PraticaListas.Pessoa;

/*
1 - Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
2 - No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
3 - Adicione pelo menos três pessoas à lista utilizando o método add.
4 - Imprima o tamanho da lista utilizando o método size.
5 - Imprima a primeira pessoa da lista utilizando o método get.
6 - Imprima a lista completa


 */
public class Pessoa {
    private String nome;
    private int idade;

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

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", Idade: " + this.getIdade() + " anos";
    }
}
