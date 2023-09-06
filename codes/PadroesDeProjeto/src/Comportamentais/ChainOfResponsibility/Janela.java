package Comportamentais.ChainOfResponsibility;

public class Janela implements HelpHandler{
    //Handlerconcreto
    private HelpHandler helpSuccessor;
    public Janela (HelpHandler helpSuccessor){
    this.helpSuccessor= helpSuccessor;
    }
    public void handlerHelp(){
        if(true){
        //código de tratamento do help ...;
        System.out.println("Tem handler para manipular situação");
        }else{
            helpSuccessor.handlerHelp();
        }
    }
    }
