package PraticaListas.Animal;

public class Cachorro extends Animal{
    @Override
    public String toString() {
        return "Informações: \n" + "Nome: " + getNome() + ", Idade: " + getIdade() + ", Peso: " + getPeso() + ", Especie: " + getEspecie();
    }
}
