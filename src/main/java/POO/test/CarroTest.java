package POO.test;

import POO.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "CIVIC";
        carro1.ano = "2019";
        carro1.modelo = "HONDA";

        System.out.println("-------------------------");

        carro2.nome = "UNO";
        carro2.ano = "2019";
        carro2.modelo = "FIAT";

        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);

        System.out.println("-------------------------");

        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);
    }
}
