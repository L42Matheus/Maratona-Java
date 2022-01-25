package associacao.domain;

public class Time {
    //Associação bidirecional um para muitos
    //Onde o time tem varios jogadores

    private String nome;
    private Jogador [] jogadores;


    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (nome == null) {
            return;
        }

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getName());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
