package repository.test;

import repository.BancoDeDados;
import repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {

        Repository repository = new BancoDeDados();

        repository.save();

        List<String> list = new ArrayList<>();
        list.add("Matheus");
        list.add("Lucas");
        list.add("Santos");
        System.out.println(list);
    }
}
