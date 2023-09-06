package Comportamentais.ChainOfResponsibility;

public class ChainRun {
    public static void main(String args[]){
        Janela j1,j2,j3;
        Botao b1;
        j1 = new Janela(null);
        j2 = new Janela(j1);
        j3 = new Janela(j2);
        b1 = new Botao(j3);
        // o usuário clica na ajuda do botão
        b1.handlerHelp();
    }
}
