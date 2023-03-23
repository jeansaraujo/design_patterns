package Criacionais.AbstractFactory;

import Criacionais.AbstractFactory.Factory.GuiFactory;
import Criacionais.AbstractFactory.Product.Button;

class Application{
    public Application(GuiFactory factory){
        Button button = factory.createButton();
        button.paint();
    }
}
