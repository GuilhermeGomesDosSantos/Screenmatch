package PraticaListas.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Titulo t1 = new Titulo("zbc");
        Titulo t2 = new Titulo("wrrew");
        Titulo t3 = new Titulo("afews");
        Titulo t4 = new Titulo("aaa");
        Titulo t5 = new Titulo("bb");
        Titulo t6 = new Titulo("a");
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(t1);
        titulos.add(t2);
        titulos.add(t3);
        titulos.add(t4);
        titulos.add(t5);
        titulos.add(t6);

        Collections.sort(titulos);
        for (Titulo tit : titulos){
            System.out.println(tit.getNome());
        }
    }
}
