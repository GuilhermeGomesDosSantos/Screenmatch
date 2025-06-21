package PraticaAPI.Livro;
/*
Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora.
Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando um livro em um objeto do tipo Livro.
 */
public record Livro(String titulo, String autor, Editora editora) {
}
