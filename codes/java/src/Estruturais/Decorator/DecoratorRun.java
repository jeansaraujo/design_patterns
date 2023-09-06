package Estruturais.Decorator;

public class DecoratorRun {
    public static void main(String[] args) {
        Janela janelaDecorada = new DecoradorBarraVertical(new JanelaSimples());
        janelaDecorada.draw();
    }
}
