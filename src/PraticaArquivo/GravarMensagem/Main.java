package PraticaArquivo.GravarMensagem;

import java.io.FileWriter;
import java.io.IOException;

/*
Crie um programa em Java que escreva
a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo."
Utilize as classes do pacote java.io.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter arquivo = new FileWriter("arquivo.txt");
            arquivo.write("Conteúdo a ser gravado no arquivo");
            arquivo.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
