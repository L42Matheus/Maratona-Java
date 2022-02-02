package associacao.seminarios.domain;

import java.util.List;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario [] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(){

    }

    public void imprimir(){
        System.out.println("-----------");
        System.out.println("Professor: " + nome);

        if (this.seminarios == null) {

            return;
        }
        System.out.println("** Seminarios Cadastrados **");

        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());

            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) {
                continue;
            }

            System.out.println("** Aluno ***");

            for (Aluno aluno : seminario.getAlunos()){
                System.out.println("Aluno : " + aluno.getNome()) ;
            }
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

}
