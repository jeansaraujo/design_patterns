package Estruturais.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
<<<<<<< HEAD
   
   private List<Component> childComponents = new ArrayList<Component>();

   public void print(){
      for(Component c: childComponents){
         c.print();
      }
   }
     
   public void add(Component c){
      childComponents.add(c);
   }

   public void remove(Component c){
      childComponents.remove(c);
   }
=======

    public void add(Composite c2) {
    }
   // private List<Component> childComponents = new ArrayList<Component>();
>>>>>>> dfc0e269ac438d54eb8d08a2a4027ce441533ae6

}
