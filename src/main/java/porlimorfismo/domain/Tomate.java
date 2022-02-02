package porlimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.6;
    private String dataDeValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate. ");
        return this.valor * IMPOSTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
