package enumeracao.domain;

public enum TIpoPagamento {

    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },

    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.5;
        }
    };

    public abstract double calcularDesconto(double valor);
}
