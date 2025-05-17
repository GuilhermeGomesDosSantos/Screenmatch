package Pratica.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno al = new Aluno();
        al.setNome("Zé");
        al.setNota1(5);
        al.setNota2(3);
        al.setNota3(9);
        al.calcularMedia();
    }
}
