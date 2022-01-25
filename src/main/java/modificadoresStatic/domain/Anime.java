package modificadoresStatic.domain;

public class Anime {
    private String nome;
    private static int [] epodios;

    static {
        System.out.println("Dentro do bloco inicialização 1");
        epodios = new int[100];

        for (int i = 0; i < epodios.length; i++) {
            epodios[i] = i+1;
        }

    }

    static {
        System.out.println("Dentro do bloco inicialização 2 ");
    }

    public Anime(){

        for (int epi : Anime.epodios){
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
