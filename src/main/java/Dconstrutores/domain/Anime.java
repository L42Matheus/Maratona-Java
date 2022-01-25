package Dconstrutores.domain;

public class Anime {

    private String nome;
    private String tipo;
    private String epsodios;
    private String genero;

    public Anime(String nome, String tipo, String epsodios, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;

    }

    public Anime(){

    }


    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEpsodios() {
        return epsodios;
    }

    public void setEpsodios(String epsodios) {
        this.epsodios = epsodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
