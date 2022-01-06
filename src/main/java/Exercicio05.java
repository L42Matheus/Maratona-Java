public class Exercicio05 {
    public static void main(String[] args) {

        double salarioAnual = 25000;
        double primeiraFAixa = 9.70 / 100;
        double segundaFAixa = 37.35 / 100;
        double terceiraFAixa = 49.50 / 100;

        double valorImposto;


        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFAixa;
        }
        else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFAixa;
        }
        else {
            valorImposto = salarioAnual * terceiraFAixa;
        }

        System.out.println(valorImposto);
    }
}
