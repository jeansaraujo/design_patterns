package Estruturais.Decorator;

public class DecoradorBarraVertical extends JanelaDecorator {
    
    public DecoradorBarraVertical(Janela janelaDecorator) {
        super(janelaDecorator);
        //TODO Auto-generated constructor stub
    }   
    public void draw(){
        drawBarraVertical();
        janelaDecorada.draw();
    }
    private void drawBarraVertical(){}
}
