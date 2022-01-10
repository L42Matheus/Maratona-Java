package POO.test;

import POO.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Lucas";
        pessoa.idade = 23;
        pessoa.sexo = 'M';


        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);

    }
}
