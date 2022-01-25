package metodos.test;

import metodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

//        pessoa.nome = "Lucas";
        pessoa.setName("Lucas");
        pessoa.setIdade(24);

        pessoa.imprimi();
    }
}
