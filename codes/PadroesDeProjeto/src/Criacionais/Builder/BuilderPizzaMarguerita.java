package Criacionais.Builder;

public class BuilderPizzaMarguerita extends PizzaBuilder{
    Pizza pizza = new Pizza();
    public void buildTempero(){
        pizza.setTempero("quente");
    }
    public void buildCobertura(){
        pizza.setCobertura("tomate");
    }
    @Override
    public Pizza getPizza(){
        return pizza;
    }
}