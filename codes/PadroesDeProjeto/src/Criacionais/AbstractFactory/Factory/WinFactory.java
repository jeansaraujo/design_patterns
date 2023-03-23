package Criacionais.AbstractFactory.Factory;

import Criacionais.AbstractFactory.Product.Button;
import Criacionais.AbstractFactory.Product.WinButton;

public class WinFactory implements GuiFactory{
    public  Button createButton(){
        return new WinButton();
    }
}
