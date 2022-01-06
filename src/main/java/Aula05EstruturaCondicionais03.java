public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "AInda não tenho condições, mas vou ter!";
        String resultado;

        //Operador Ternário.

        String valor = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        boolean isComprar = salario > 5000 ? true : false;

        /*if (salario > 5000) {
            resultado = mensagemDoar;
        }
        else{
            resultado = mensagemNaoDoar;
        }*/

        System.out.println(valor);
        System.out.println(isComprar);

    }
}
