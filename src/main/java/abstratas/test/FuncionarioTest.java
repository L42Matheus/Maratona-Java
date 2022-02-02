package abstratas.test;

import abstratas.domain.Dev;
import abstratas.domain.Funcionario;
import abstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
//        Funcionario funcionario = new Funcionario("Zoro", 2000);

        Gerente gerente = new Gerente("Nami", 5000);
        Dev dev = new Dev("lUFFY", 3800);

        System.out.println(gerente);
        System.out.println(dev);
    }
}
