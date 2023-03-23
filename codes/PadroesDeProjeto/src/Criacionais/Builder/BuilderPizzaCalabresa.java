package Criacionais.Builder;

public class BuilderPizzaCalabresa extends PizzaBuilder{
    Pizza pizza = new Pizza();
    public void buildTempero(){
        pizza.setTempero("medio");    
    }
    public void buildCobertura(){
        pizza.setCobertura("calabresa");
    }
}
