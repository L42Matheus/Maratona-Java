package enumeracao.test;

import enumeracao.domain.Cliente;
import enumeracao.domain.TIpoPagamento;
import enumeracao.domain.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, TIpoPagamento.DEBITO);

        Cliente cliente3 = new Cliente("Meus", TipoCliente.PESSOA_JURIDICA, TIpoPagamento.CREDITO);



        System.out.println(cliente1);

        System.out.println(cliente3);

        System.out.println(TIpoPagamento.DEBITO.calcularDesconto(100));

    }
}
