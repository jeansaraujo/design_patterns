package Criacionais.AbstractFactory;

import java.util.Properties;
import Criacionais.AbstractFactory.Factory.GuiFactory;
import Criacionais.AbstractFactory.Factory.OSXFactory;
import Criacionais.AbstractFactory.Factory.WinFactory;

public class ApplicationRunner{
    /**
     * @param args
     */
    public static void main(String args[]){
        Properties properties = System.getProperties();
        System.out.println(properties.toString());
        System.out.println( System.getProperty("os.name") );
        new Application(createOsSpecificFactory());
    }
    public static GuiFactory createOsSpecificFactory(){
        int sys = readFromConfigFile("OS_TYPE");
        if(sys == 0){
            return new WinFactory();
        }else{
            return new OSXFactory();
            
        }
    }
    private static int readFromConfigFile(String string) {
        return 1;
    }
}