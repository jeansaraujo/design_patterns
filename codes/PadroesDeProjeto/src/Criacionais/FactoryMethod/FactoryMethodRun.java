package Criacionais.FactoryMethod;
import Criacionais.FactoryMethod.Factory.FactoryPessoa;
public class FactoryMethodRun {
    public static void main(String args[]){
        FactoryPessoa factory = new FactoryPessoa();
        //String nome = args[0];
        //String sexo = args[1];
        String nome = "Jean";
        String sexo = "M";
        factory.getPessoa(nome,sexo);
    }
}
