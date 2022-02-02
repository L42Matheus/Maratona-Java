package porlimorfismo.test;

import porlimorfismo.domain.Computador;
import porlimorfismo.domain.Produto;
import porlimorfismo.domain.Tomate;
import porlimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Produto produto = new Computador("Dell", 11000);

        Tomate tomate = new Tomate("Tomato", 10);
        tomate.setDataDeValidade("12/01/2222");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------");

    }
}
