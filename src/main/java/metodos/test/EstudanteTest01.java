package metodos.test;

import metodos.domain.Estudante;
import metodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();



        estudante.nome = "Minato";
        estudante.idade = 23;
        estudante.sexo = 'M';


        estudante02.nome = "Hinata";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante);

        System.out.println("------------------");

        impressoraEstudante.imprime(estudante02);

    }
}
