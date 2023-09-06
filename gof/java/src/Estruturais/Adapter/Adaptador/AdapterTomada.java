package Estruturais.Adapter.Adaptador;
import Estruturais.Adapter.Adaptada.PlugTresPinos;
import  Estruturais.Adapter.Alvo.PlugDoisPinos;
import Estruturais.Adapter.Tomada;

public class AdapterTomada  extends PlugDoisPinos{
    private PlugTresPinos plugTresPinos;

    public AdapterTomada(PlugTresPinos p){
        this.plugTresPinos = p;
    }
    
    public void ligarDoisPinos(Tomada t){
        plugTresPinos.ligarTresPinos(t);
    }
}
