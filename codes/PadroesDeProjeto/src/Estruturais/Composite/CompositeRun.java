package Estruturais.Composite;
import Estruturais.Composite.Composite;

public class CompositeRun {
    public static void main(String[] args) {
        Leaf folha1 = new Leaf();
        Leaf folha2 = new Leaf();
        folha1.print();
        folha2.print();

        Composite c = new Composite();        
        Composite c2 = new Composite();
        Composite c3 = new Composite();

        //c.add(folha1);
        //c.add(folha2);

        //c2.add(folha1);

        c.add(c2);
        c.add(c3);

        c.print();
    }
}

