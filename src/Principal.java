import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);

        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.exibeFichaTecnica();
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        // Construtor: método que tem como função, a criação de um objeto em memória
        var filmeDoPaulo = new Filme("Dogville", 2003); //A variável var realiza uma inferência do tipo declarado
        //porque você não declarou o tipo explicitamente, mas o compilador consegue descobrir qual é
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFIlmes = new ArrayList<>();
        listaDeFIlmes.add(filmeDoPaulo);
        listaDeFIlmes.add(meuFilme);
        listaDeFIlmes.add(outroFilme);
        System.out.println("Tamaho da lista " + listaDeFIlmes.size());
        System.out.println("Primeiro filme " + listaDeFIlmes.get(0).getNome());
        System.out.println(listaDeFIlmes);
        System.out.println("ToString do filme " + listaDeFIlmes.get(0).toString());
    }
}
