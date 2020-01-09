package pl.codegym.task.task12.task1227;                                                  
                                                  
/*                                                   
CanFly, CanRun i CanSwim dla klas Duck, Penguin i Toad                                                  
*/                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) {                                                  
                                                  
    }                                                  
                                                  
    public interface CanFly {                                                  
        public void fly();                                                  
    }                                                  
                                                  
    public interface CanRun {                                                  
        public void run();                                                  
    }                                                  
                                                  
    public interface CanSwim {                                                  
        public void swim();                                                  
    }                                                  
                                                  
    public class Duck implements CanSwim,CanFly,CanRun{                                                  
     public void swim(){}
     public void run(){}
     public void fly(){}                                             
    }                                                  
                                                  
    public class Penguin implements CanRun,CanSwim {                                                  
      public void swim(){}
     public void run(){}                                            
    }                                                  
                                                  
    public class Toad implements CanSwim {                                                  
       public void swim(){}
                                                
    }                                                  
}