package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++){
            minhaMusica.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Bolha Dev");
        podcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++){
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            podcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(minhaMusica);
    }
}
