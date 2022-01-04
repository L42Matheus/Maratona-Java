    /*
    pratica

    Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salaio de <salario>, na data <data>
     */

    import java.time.LocalDateTime;

    public class Aula03Exercicio {
    public static void main(String[] args) {

        String name = "Lucas Matheus";
        String adress = "Santo Antônio";
        double salary = 2500d;
        String date = "03/01/1998";


        System.out.println("Eu " + name + " morando no endereço: " + adress +
                " confirmo que recebi o salaio de $ " + salary + " na data " + date);


    }
}
