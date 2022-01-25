package metodos.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 1 ao 100 = 1 seculo
        //101 ao 200 = 2 seculo

        System.out.println("Digite um ano: ");
        Scanner entrada = new Scanner(System.in);

        int ano = entrada.nextInt();
        var seculo = ano / 100 + 1;

        System.out.println("O século é: " + seculo);

    }
}
