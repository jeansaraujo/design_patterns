package Comportamentais.Strategy;

public class StrategyRun {    
    public static void main(String[] args){
        Context contexto;
        contexto = new Context(new ConcretyStrategyAdd());
        int resultA= contexto.executeStrategy(3,4);
        contexto = new Context(new ConcretyStrategySubstract());
        int resultB= contexto.executeStrategy(3,4);
        contexto = new Context(new ConcretyStrategyMultiply());
        int resultC= contexto.executeStrategy(3,4);
        System.out.println("Soma: "+resultA);
        System.out.println("Subtração: "+resultB);
        System.out.println("Multiplicação: "+resultC);        
    }
}
    
