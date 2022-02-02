package porlimorfismo.test;

import porlimorfismo.domain.Computador;
import porlimorfismo.domain.Produto;
import porlimorfismo.domain.Tomate;
import porlimorfismo.service.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Dell", 11000);
        Produto produto2 = new Tomate("Tomato", 10);

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("--------------------");

        CalculadoraImposto.calcularImposto(produto2);




    }
}
