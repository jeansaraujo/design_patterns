package Criacionais.Builder;

public class ExemploBuilder{
    public static void main(String[] args){
    Cozinhar c = new Cozinhar();
    PizzaBuilder builderPizzaMarguerita = new BuilderPizzaMarguerita();
    PizzaBuilder builderPizzaCalabresa = new BuilderPizzaCalabresa();
    c.setPizzaBuilder(builderPizzaMarguerita);
    c.construirPizza();
    Pizza marguerita = c.getPizza();
    c.setPizzaBuilder(builderPizzaCalabresa);
    c.construirPizza();
    Pizza calabresa = c.getPizza();
    }
}
