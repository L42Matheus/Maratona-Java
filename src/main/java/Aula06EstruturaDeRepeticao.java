public class Aula06EstruturaDeRepeticao {
    public static void main(String[] args) {
        //While
        int cont = 1;
        while(cont <= 100){
            if (cont % 2 == 0){
                System.out.println("While pares " + cont);
            }
            cont +=1;
        }
        //Do while
       int contador = 0;

        do {
            if (contador % 2 == 0) {
                System.out.println("Do-While pares " + contador);

            }
              contador+=1;
        }while (contador <= 100);

        //For
        for (int i = 1; i <= 1000; i++){
            if (i % 2 == 0) {
                System.out.println("For pares " + i);
            }
        }
    }
}
