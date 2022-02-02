package heranca.domain;

public class Funcionario extends Pessoa{

    private double salario;

    static {
        System.out.println("Dentro do statico funcionario0");
    }
    {
        System.out.println("Dentro de incialização funcionario 1");
    }
    {
        System.out.println("Dentro de incialização funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor Funcionario");
    }

    public void imprimi(){
        super.imprimi();
        System.out.println("Salario: " + salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
