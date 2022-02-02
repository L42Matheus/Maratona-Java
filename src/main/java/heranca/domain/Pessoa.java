package heranca.domain;

public class Pessoa {

    private String nome;
    private String cpf;
    private Endereco endereco;

    static {
        System.out.println("Dentro do statico");
    }
    {
        System.out.println("Dentro de incialização 1");
    }
    {
        System.out.println("Dentro de incialização 2");
    }



    public Pessoa(String nome) {
        System.out.println("DEntro do cosntrutor pessoa");
        this.nome = nome;
    }

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println("Rua: " + endereco.getRua() + " CEP: " + endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
