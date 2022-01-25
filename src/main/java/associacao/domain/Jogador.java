package associacao.domain;

public class Jogador {
    //Associação unidirecional um para muitos
    // onde o jogador tem apenas um time
    private String name;
    private Time time;

    public Jogador(String name) {
        this.name = name;
    }

    public void imprime(){
        System.out.println(this.name);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
