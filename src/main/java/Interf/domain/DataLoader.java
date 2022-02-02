package Interf.domain;

public interface DataLoader {

    void load();

    default void checkPermission(){
        System.out.println("Fazendo chcagem de permissões");
    };

}
