package Estruturais.Bridge;

//**  "Refined Abstraction" */
class Linha implements Forma{
	private APIDeDesenho api;
    int x,y;
	public Linha(int x, int y, APIDeDesenho api){
		this.x = x;
		this.y = y;
		this.api = api;
	}
	public void desenharLinha(){
		api.desenharLinha(x,y);
	}
}