public class Aula04Operador {
    public static void main(String[] args){

        int numero01 = 10;
        double numero02 = 20;

        var soma = numero01 + numero02;
        var multiplicacao = numero01 * numero02;
        var divisao = numero01 / numero02;
        var subtracao = numero01 - numero02;

        System.out.println("Adição: " + soma);
        System.out.println("Multiplicação: " +multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Subtraçao: " + subtracao);
        System.out.println("--------------------------------");

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println("---------------------------------");

        //&& (And) || (Or) ! (Not)
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeioMaiorQueTrinta = idade > 30 && salario > 4.612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println(isDentroDaLeioMaiorQueTrinta);

        double contaCorrente = 200;
        double contaPoupanca = 5001;
        double playstation = 5000;

        boolean isPlayCompravel = contaCorrente > playstation || contaPoupanca > playstation;

        System.out.println("isPlayCompravel " + isPlayCompravel);
        System.out.println("-----------------------------------");

        double bonus = 1800;
        bonus += 1000;  // 2800
        bonus -= 1000;  // 1800
        bonus *= 2;     // 3800

        System.out.println(bonus);



    }
}
