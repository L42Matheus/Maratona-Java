package associacao.test;

import associacao.domain.Jogador;
import associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("PSG");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
