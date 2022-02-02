package associacao.seminarios.test;

import associacao.seminarios.domain.Aluno;
import associacao.seminarios.domain.Local;
import associacao.seminarios.domain.Professor;
import associacao.seminarios.domain.Seminario;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class SeminarioTest {
    public static void main(String[] args) {

        Local local = new Local("Santo Antonio", "123", "58406025");

        Aluno aluno = new Aluno("Lucas", 19);

        Professor professor = new Professor("Batman", "Engenheiro");

        Aluno [] alunoParaSeminario = {aluno};

        Seminario seminario = new Seminario("A escuridão",alunoParaSeminario, local);

        Seminario [] seminariosDisponivel = {seminario};

        professor.setSeminarios(seminariosDisponivel);

        professor.imprimir();

    }
}
