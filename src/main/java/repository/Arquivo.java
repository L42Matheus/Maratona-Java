package repository;

public class Arquivo implements Repository{
    @Override
    public void save() {
        System.out.println("Salvando no arquivo! ");
    }
}
