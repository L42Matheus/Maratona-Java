package enumeracao.domain;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TIpoPagamento tIpoPagamento;


    public Cliente(String nome, TipoCliente tipoCliente, TIpoPagamento tIpoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tIpoPagamento = tIpoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TIpoPagamento gettIpoPagamento() {
        return tIpoPagamento;
    }

    public void settIpoPagamento(TIpoPagamento tIpoPagamento) {
        this.tIpoPagamento = tIpoPagamento;
    }
}
