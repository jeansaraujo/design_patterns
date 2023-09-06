package Estruturais.Facede;
import Estruturais.Facede.Partes.*;;

public class Computer {    
    private  CPU cpu = null;
    private Memory memory  = null;
    private HardDrive hardDrive = null;

    public Computer(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();        
    }

    public void startComputer(){
        cpu.freeze();
        memory.load(0, null);
        hardDrive.read(5, 20);
        cpu.jump(0);
        cpu.execute();
    }
}
