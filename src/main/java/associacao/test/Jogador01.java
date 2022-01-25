package associacao.test;

import associacao.domain.Jogador;

public class Jogador01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar");
        Jogador j2 = new Jogador("Lucas");
        Jogador j3 = new Jogador("Renato");

        Jogador [] jogadores = {j1, j2, j3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
