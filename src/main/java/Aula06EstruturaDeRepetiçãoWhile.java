public class Aula06EstruturaDeRepetiçãoWhile {
    public static void main(String[] args) {
        // while, do while, for

        int contador = 0;

        while(contador <= 10){
            System.out.println(contador);
            contador += 1;
        }

        //Do while
        do {
            System.out.println("Dentro do do-while");
            contador++;
        } while (contador <= 10);


        //for
        for (int i = 0;i < 10; i++){
            System.out.println(i);
        }
    }
}
