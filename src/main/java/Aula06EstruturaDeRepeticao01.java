public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        int cont = 0;

        while(cont <= 10){
            if (cont % 2 == 0){
                System.out.println("While pares " + cont);
                cont +=1;
            }
        }


        //Do while
        do {
            System.out.println("Dentro do do-while");
            cont++;
        } while (cont <= 10);


        //for
        for (int i = 0;i < 10; i++){
            System.out.println(i);
        }
    }
}
