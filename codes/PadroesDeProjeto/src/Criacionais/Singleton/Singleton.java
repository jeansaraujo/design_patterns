package Criacionais.Singleton;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private Singleton(){
        System.out.println("Acesso a Instância controlada");

    }
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
