package Criacionais.Prototype.PrototipoAbstrato;

abstract public class Documento implements Cloneable{

	public Object clone(){
		Object clone = null;
		try{
			clone = super.clone();
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return (Documento) clone;
	}
}
