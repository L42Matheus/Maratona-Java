package POO.test;

import POO.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();

        var nome = professor.nome = "Lucas";
        var idade = professor.idade = 23;
        var sexo = professor.sexo = 'M';

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);


    }
}
