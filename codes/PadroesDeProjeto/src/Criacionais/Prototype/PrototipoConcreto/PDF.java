package Criacionais.Prototype.PrototipoConcreto;
import Criacionais.Prototype.PrototipoAbstrato.Documento;

public class PDF extends Documento{
    public PDF(){
        System.out.println("PDF");
    }
    @Override
    public Object clone() {
        // TODO Auto-generated method stub
        return super.clone();
    }
}
