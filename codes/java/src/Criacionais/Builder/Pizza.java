package Criacionais.Builder;

public class Pizza{
    private String tempero = "";
    private String cobertura = "";
    public void setTempero(String tempero){
    this.tempero = tempero;
    }
    public void setCobertura(String cobertura){
    this.cobertura = cobertura;
    }
    public String getTempero(){
       return this.tempero;        
    }
    public String getCobertura(){
        return this.cobertura;
    }
}