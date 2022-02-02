package repository;

public class BancoDeDados implements Repository{
    @Override
    public void save() {
        System.out.println("Salvando no Banco De Dados! ");
    }
}
