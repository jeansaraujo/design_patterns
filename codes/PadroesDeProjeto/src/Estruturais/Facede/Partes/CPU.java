package Estruturais.Facede.Partes;

import java.text.ParsePosition;

import javax.sql.rowset.spi.SyncResolver;

public class CPU {
    public void freeze(){
        System.out.println("Refrigeração inicializada ...");
    }
       public void jump(long position){
        System.out.println("Posicionar execução para ponto "+position);
    }
    public void execute(){
        System.out.println("Inicializado Execução ...");
    }    
}
