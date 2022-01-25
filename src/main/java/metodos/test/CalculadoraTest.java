package metodos.test;

import metodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Calculadora calculadora2 = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("-------------");
        calculadora2.subtraiDoisNumeros();

    }
}
