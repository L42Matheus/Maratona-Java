package metodos.domain;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);

    }

    public void subtraiDoisNumeros(){
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(double numero1, double numero2){
        System.out.println(numero1 * numero2);
    }

    public double dividiDoisNumeros(double num1, double num2){
        double dividi = num1 + num2;
        return dividi;
    }

    public void alterarDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

}
