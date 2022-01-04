public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria juvenil
        // >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 18;
        boolean isIdadeMaiorQueDezoito = true;
        boolean isIdadeMenorQueDezoito = false;

        if (idade < 15) {
            System.out.println("Categoria juvenil!");
        }
        else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        }
        else {
            System.out.println("Categoria Adulto");
        }

    }
}
