package Estruturais.FlyWheight;

import Estruturais.FlyWheight.Factory.Factory;
import Estruturais.FlyWheight.Objeto.Contexto;

public class FlyWheightRun {

    public static void main(String[] args) {
        Factory f = new Factory(Character.MAX_VALUE);

        f.getCaractere('p').desenharNaTela(new Contexto(1,1));
        f.getCaractere('a').desenharNaTela(new Contexto(1,2));
    }
}
