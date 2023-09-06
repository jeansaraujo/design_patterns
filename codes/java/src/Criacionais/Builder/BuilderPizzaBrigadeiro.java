package Criacionais.Builder;

public class BuilderPizzaBrigadeiro extends PizzaBuilder{
    Pizza pizza = new Pizza();
    public void buildTempero(){
        pizza.setTempero("doce");    
    }
    public void buildCobertura(){
        pizza.setCobertura("chocolate");
    }
    @Override
    public Pizza getPizza(){
        return pizza;
    }
}
