package heranca.test;

import heranca.domain.Endereco;
import heranca.domain.Funcionario;
import heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Santo Antônio");
        endereco.setCep("1234556");

        System.out.println("PESSOA");

        Pessoa pessoa = new Pessoa("Lucas");
        pessoa.setCpf("123");
        pessoa.setEndereco(endereco);

        System.out.println("-------------------");
        pessoa.imprimi();

        System.out.println();
        System.out.println("FUNCIONARIO");
        Funcionario funcionario = new Funcionario("Matheus");

        funcionario.setCpf("345");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);
        System.out.println("-------------------");
        funcionario.imprimi();

    }
}
