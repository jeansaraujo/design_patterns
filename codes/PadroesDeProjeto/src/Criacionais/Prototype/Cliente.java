package Criacionais.Prototype;
import Criacionais.Prototype.PrototipoAbstrato.Documento;
import Criacionais.Prototype.PrototipoConcreto.PDF;
import Criacionais.Prototype.PrototipoConcreto.ASCII;

class Cliente{
	static final int DOCUMENTO_TIPO_ASCII = 0;
	static final int DOCUMENTO_TIPO_PDF = 1;

	private Documento ascii = new ASCII();
	private Documento pdf = new PDF();
	
	public Object criarDocumento(int tipo){
		if (tipo==Cliente.DOCUMENTO_TIPO_ASCII){
			return ascii.clone();
		} else {
            return pdf.clone();
		}
	}
}
	