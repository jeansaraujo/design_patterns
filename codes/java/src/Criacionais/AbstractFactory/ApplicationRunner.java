package Criacionais.AbstractFactory;

import Criacionais.AbstractFactory.Factory.GuiFactory;
import Criacionais.AbstractFactory.Factory.OSXFactory;
import Criacionais.AbstractFactory.Factory.WinFactory;

public class ApplicationRunner{
    /**
     * @param args
     */
    public static void main(String args[]){
        new Application(createOsSpecificFactory());
    }
    public static GuiFactory createOsSpecificFactory(){
        int sys = readFromConfigFile(System.getProperty("os.name") );
        System.out.println(System.getProperty("os.name"));        
        if(sys == 0){
            return new WinFactory();
        }else{
            return new OSXFactory();
            
        }
    }
    private static int readFromConfigFile(String sisope) {
        switch (sisope){
            case "Windows 10":
                return 0;
            default:
                return 1;
        }        
    }
}