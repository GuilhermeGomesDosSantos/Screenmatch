package PraticaExcecoes.GitHub;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {

            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o nome do usuário");
            var user = leitura.nextLine();

            BuscarUser searchUser = new BuscarUser(user);
        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
    }
}
