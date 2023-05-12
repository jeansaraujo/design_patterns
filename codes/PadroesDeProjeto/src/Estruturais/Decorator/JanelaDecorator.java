package Estruturais.Decorator;

public class JanelaDecorator extends Janela{
    protected Janela janelaDecorada;

    public JanelaDecorator (Janela janelaDecorator){
        super.janelaDecorada = janelaDecorator;
    }
    
    public void draw() {
        drawBarraVertical();
        janelaDecorada.draw();        
    }
    private void drawBarraVertical(){
        System.out.println("Barra Vertical");
    }
}