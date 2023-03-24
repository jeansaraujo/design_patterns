package Criacionais.FactoryMethod.ProdutoConcreto;

import Criacionais.FactoryMethod.ProdutoAbstrato.Pessoa;

public class Homem extends Pessoa{
    public Homem(String nomeCompleto){
        System.out.println ("Olá Senhor,"+nomeCompleto);
    }
}