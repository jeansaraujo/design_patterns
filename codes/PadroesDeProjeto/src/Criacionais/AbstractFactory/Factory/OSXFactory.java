package Criacionais.AbstractFactory.Factory;

import Criacionais.AbstractFactory.Product.Button;
import Criacionais.AbstractFactory.Product.OSXButton;

public class OSXFactory implements GuiFactory{
    public  Button createButton(){
        return new OSXButton();
    }
}
