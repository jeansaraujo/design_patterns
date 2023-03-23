package Criacionais.Builder;

public class Cozinhar{
    private PizzaBuilder pizzaBuilder;
    public void setPizzaBuilder(PizzaBuilder pb){
    pizzaBuilder = pb;
    }
    public Pizza getPizza(){
    return pizzaBuilder.getPizza();
    }
    public void construirPizza(){
    pizzaBuilder.criarNovoProdutoPizza();
    pizzaBuilder.buildTempero();
    pizzaBuilder.buildCobertura();
    }
}
    
