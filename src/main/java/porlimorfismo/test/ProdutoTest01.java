package porlimorfismo.test;

import porlimorfismo.domain.Computador;
import porlimorfismo.domain.Tomate;
import porlimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell", 11000);

        Tomate tomate = new Tomate("Tomato", 10);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(tomate);

    }
}
