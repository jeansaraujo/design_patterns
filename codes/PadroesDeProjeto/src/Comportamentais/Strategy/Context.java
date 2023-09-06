package Comportamentais.Strategy;

class Context{
    public Strategy strategy;
    public Context (Strategy strategy){
        this.strategy= strategy;
    }
    public int executeStrategy(int a, int b){
        return strategy.execute(a,b);
    }
}

