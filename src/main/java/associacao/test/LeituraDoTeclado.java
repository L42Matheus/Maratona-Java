package associacao.test;

import java.util.Scanner;

public class LeituraDoTeclado{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do jogador");
        String jogador1 = entrada.nextLine();

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        System.out.println("---------------------");
        System.out.println("Jogador: " + jogador1);
        System.out.println("Idade: " + idade);
    }


}
