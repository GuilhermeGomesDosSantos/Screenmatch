package Pratica.Animal;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("O gato está miando...");
    }

    public void arranharMoveis(){
        System.out.println("O gato está arranhando os imoveis...");
    }
}
