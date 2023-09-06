package Estruturais.FlyWheight.Factory;

import Estruturais.FlyWheight.Objeto.Caractere;

public class Factory {
    private Caractere[] pool;
    public Factory(int max){
        pool = new Caractere[max];        
    }
    public Caractere getCaractere(char c){
        if (pool[c] == null){
            pool[c] = new Caractere(c);
        }
        return pool[c];
    }
}
