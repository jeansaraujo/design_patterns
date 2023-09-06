package Comportamentais.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExemplo{   
        public static void main(String args[]){
        // cria um ArrayList
        ArrayList al = new ArrayList();
        // adiciona elementos à coleção
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("D");
        al.add("F");
        // utiliza o Iteratorpara visualizar o conteúdo da coleção
        Iterator itr= al.iterator();
        while(itr.hasNext()){
            Object elemento = itr.next();
            System.out.print(elemento);
        }
    }
}
