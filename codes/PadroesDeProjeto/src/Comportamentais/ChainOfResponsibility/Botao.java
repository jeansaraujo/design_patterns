package Comportamentais.ChainOfResponsibility;

public class Botao implements HelpHandler{
    //Handlerconcreto
    private HelpHandler helpSuccessor;

    public Botao(HelpHandler helpSuccessor){
        this.helpSuccessor= helpSuccessor;
    }

    public void handlerHelp(){
        if(true){
            //código de tratamento do help ...;
        }else{
            helpSuccessor.handlerHelp();
        }
    }
}