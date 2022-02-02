package porlimorfismo.service;

import porlimorfismo.domain.Produto;
import porlimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorío de IMP");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
        if (produto instanceof  Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValidade());
        }


    }
}
