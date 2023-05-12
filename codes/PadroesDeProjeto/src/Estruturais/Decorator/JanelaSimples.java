package Estruturais.Decorator;

public class JanelaSimples extends Janela{
    protected Janela janelaDecorada;
    public void draw(){    
        System.out.println("Janela Simples");    
    }
}
