package Estruturais.Bridge;

public class BridgeRun {
    public static void main(String[] args) {
        Forma[] formas = new Forma[2];
        formas[0] = new Linha(1,2,new APIDeDesenho1());
        formas[1] = new Linha(5,7,new APIDeDesenho2());
        
        for (Forma forma: formas){
            forma.desenharLinha();
        }        
    }
}
