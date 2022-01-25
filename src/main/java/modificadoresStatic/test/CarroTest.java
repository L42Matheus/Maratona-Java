package modificadoresStatic.test;

import modificadoresStatic.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 200);

        Carro carro2 = new Carro("CIVIC", 275);

        Carro.setVelocidadeLimite(220);

        carro1.imprime();
        carro2.imprime();

    }
}
