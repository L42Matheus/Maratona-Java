package associacao.test;

import associacao.domain.Jogador;
import associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("PSG");
        Jogador jogadores [] = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--------Jogador--------");
        jogador1.imprime();

        System.out.println("--------Time--------");
        time.imprime();
    }
}
