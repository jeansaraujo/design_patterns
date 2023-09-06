package Criacionais.FactoryMethod.Factory;
import Criacionais.FactoryMethod.ProdutoAbstrato.Pessoa;
import Criacionais.FactoryMethod.ProdutoConcreto.Homem;
import Criacionais.FactoryMethod.ProdutoConcreto.Mulher;
public class FactoryPessoa {    
    public Pessoa getPessoa (String nome, String sexo){
        if(sexo.equals("M"))
            return new Homem(nome);
        if(sexo.equals("F"))
            return new Mulher(nome);
        else
            return null;
    }
}
