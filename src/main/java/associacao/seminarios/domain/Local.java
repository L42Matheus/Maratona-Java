package associacao.seminarios.domain;

public class Local {
    private String endereco;
    private String numero;
    private String cep;

    public Local(String endereco, String numero, String cep) {
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
    }

    public Local(){

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
