package metodos.domain;

public class Pessoa {
   private String name;
   private int idade;

   public void imprimi(){
       System.out.println(this.name);
       System.out.println(this.idade);
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
