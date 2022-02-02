package repository;

public class Memoria implements Repository{
    @Override
    public void save() {
        System.out.println("Salvando em memoria! ");
    }
}
