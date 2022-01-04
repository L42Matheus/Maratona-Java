public class Aula05EstrutrasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida");
        }
        else {
            System.out.println("Não pode comprar bebida");
        }

    }
}
