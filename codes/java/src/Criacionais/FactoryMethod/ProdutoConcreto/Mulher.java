package Criacionais.FactoryMethod.ProdutoConcreto;
import Criacionais.FactoryMethod.ProdutoAbstrato.Pessoa;

public class Mulher extends Pessoa{
    public Mulher(String nomeCompleto){
        System.out.println ("Olá Senhora,"+nomeCompleto);
    }
}
