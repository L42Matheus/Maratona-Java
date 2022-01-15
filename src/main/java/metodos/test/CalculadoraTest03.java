package metodos.test;

import metodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 2;
        int num2 = 3;

        calculadora.alterarDoisNumeros(num1, num2);
    }
}
