package associacao.test;

import associacao.domain.Escola;
import associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Matheus");

        Professor [] professores = {professor, professor2};

        Escola escola = new Escola("Brasil", professores);

        escola.imprime();

    }
}
