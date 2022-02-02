package modificador.test;

import modificador.domain.Carro;
import modificador.domain.Comprador;
import modificador.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Lucas");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();

    }
}
