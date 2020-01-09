package pl.codegym.task.task12.task1219;                                                  
                                                  
/*                                                   
Stworzenie człowieka                                                  
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
                                                  
                                                  
    public class Human implements CanRun,CanSwim{                                                  
     public void run(){};
     public void swim(){};                                             
    }                                                  
                                                  
    public class Duck implements CanFly,CanSwim,CanRun {                                                  
       public void run(){};
       public void swim(){};
       public void fly(){};                                    
    }                                                  
                                                  
    public class Penguin implements CanRun,CanSwim{                                                  
         public void run(){};
         public void swim(){};                                         
    }                                                  
                                                  
    public class Airplane implements CanFly,CanRun{                                                  
      public void fly(){};
      public void run(){};                                            
    }                                                  
}