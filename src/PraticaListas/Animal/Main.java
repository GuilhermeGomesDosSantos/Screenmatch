package PraticaListas.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.setNome("Sla");
        animal.setIdade(4);
        animal.setPeso(23.4);
        animal.setEspecie("American Bully");

        if(animal instanceof Cachorro){
            Cachorro dog = (Cachorro) animal;
            System.out.println("O objeto é cachorro");
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
