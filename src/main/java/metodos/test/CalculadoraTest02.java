package metodos.test;

import metodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Calculadora calculadora2 = new Calculadora();

        calculadora.multiplicaDoisNumeros(10, 10);
        System.out.println("--------------------");
        System.out.println(calculadora.dividiDoisNumeros(10, 2));




    }
}
