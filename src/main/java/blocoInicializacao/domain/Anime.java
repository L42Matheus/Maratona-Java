package blocoInicializacao.domain;

import java.util.stream.Stream;

public class Anime {
    private String nome;
    private int [] epodios;

    {
        System.out.println("Dentro do bloco inicialização");
        epodios = new int[100];

        for (int i = 0; i < epodios.length; i++) {
            epodios[i] = i+1;
        }

    }

    public Anime(){

        for (int epi : this.epodios){
            System.out.println(epi + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpodios() {
        return epodios;
    }
}
