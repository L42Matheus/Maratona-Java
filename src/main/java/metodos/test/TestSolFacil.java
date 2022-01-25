package metodos.test;

import java.util.Scanner;

public class TestSolFacil {
    public static void main(String[] args) {

        int pontosCampeonato = 0;
        int partida = 1;
        while (partida < 10) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o placar do seu time: " + partida);
            int x = entrada.nextInt();

            System.out.println("Digite o placar do adversário: " + partida);
            int y = entrada.nextInt();

            if (x > y) {
                pontosCampeonato += 3;
            } else if (x == y) {
                pontosCampeonato += 1;
            } else {
                pontosCampeonato += 0;
            }
            partida++;

        }
        System.out.println("Pontos no campeonato: " + pontosCampeonato);
    }
}
