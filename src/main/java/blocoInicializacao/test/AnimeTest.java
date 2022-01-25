package blocoInicializacao.test;

import blocoInicializacao.domain.Anime;
import com.sun.tools.javac.Main;

import javax.crypto.spec.PSource;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println(anime);
        System.out.println("-----------");
        System.out.println(anime.getEpodios());

        for (int epodio : anime.getEpodios()) {
            System.out.println(epodio + " ");
        }
        
    }


}
