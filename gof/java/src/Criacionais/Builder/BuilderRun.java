package Criacionais.Builder;

public class BuilderRun{
    public static void main(String[] args){
    Cozinhar c = new Cozinhar();
    PizzaBuilder builderPizzaMarguerita = new BuilderPizzaMarguerita();
    PizzaBuilder builderPizzaCalabresa = new BuilderPizzaCalabresa();
    PizzaBuilder builderPizzaBrigadeiro = new BuilderPizzaBrigadeiro();
    c.setPizzaBuilder(builderPizzaMarguerita);
    c.construirPizza();
    Pizza marguerita = c.getPizza();
    System.out.println(marguerita.getCobertura());
    System.out.println(marguerita.getTempero());
    System.out.println("Construindo nova Pizza");
    c.setPizzaBuilder(builderPizzaCalabresa);
    c.construirPizza();
    Pizza calabresa = c.getPizza();
    System.out.println(calabresa.getCobertura());
    System.out.println(calabresa.getTempero());
    c.setPizzaBuilder(builderPizzaBrigadeiro);
    c.construirPizza();
    Pizza brigadeiro = c.getPizza();
    System.out.println(brigadeiro.getCobertura());
    System.out.println(brigadeiro.getTempero());
    }
}
