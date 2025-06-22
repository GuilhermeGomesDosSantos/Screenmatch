package PraticaExcecoes.ExcecaoSenha;

import java.util.Scanner;

/*
Crie um programa que lê uma senha do usuário.
Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).
*/
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        try {
            System.out.println("Digite uma senha:");
            var newPassowrd = leitura.nextLine();
            Senha password = new Senha(newPassowrd);
            System.out.println("A senha foi criada com sucesso");

        } catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
