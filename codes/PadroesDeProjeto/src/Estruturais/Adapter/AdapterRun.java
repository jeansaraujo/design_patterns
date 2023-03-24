package Estruturais.Adapter;

import Estruturais.Adapter.Adaptada.PlugTresPinos;
import Estruturais.Adapter.Adaptador.AdapterTomada;

public class AdapterRun {
    public static void main(String[] args) {
        PlugTresPinos p3 = new PlugTresPinos();

        AdapterTomada a = new AdapterTomada(p3);
        a.ligarDoisPinos(new Tomada());
    }
    
}
