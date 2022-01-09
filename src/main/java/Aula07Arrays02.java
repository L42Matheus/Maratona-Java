public class Aula07Arrays02 {
    public static void main(String[] args) {
        String [] nome = new String[3];

        nome[0] = "Lucas";
        nome[1] = "Matheus";
        nome[2] = "Stancovic";

//        System.out.println(nome[0]);
//        System.out.println(nome[1]);
//        System.out.println(nome[2]);
        for(int i = 0; i < nome.length; i++){
            System.out.println(nome[i]);
        }



    }
}
