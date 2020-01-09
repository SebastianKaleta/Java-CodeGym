package pl.codegym.task.task12.task1226;                                                  
                                                  
/*                                                   
Wspinaj się, lataj i biegaj                                                  
*/                                                  
                                                  
public class Solution {                                                  
                        
    public interface CanFly{
      void fly();
      
    }

public interface CanClimb{
      void climb();
      
    }

public interface CanRun{
      void run();
      
    }
                          
    public static void main(String[] args) {                                                  
                                                  
    }                                                  
                                                  
    public class Cat implements CanClimb,CanRun{                                                  
   public void run(){}
   public void climb(){}
 }                                                  
                                                  
    public class Dog implements CanRun{                                                  
    public void run(){}
   //public climb(){}
}                                                  
                                                  
    public class Tiger extends Cat {                                                  
    }                                                  
                                                  
    public class Duck implements CanFly,CanRun{                                                  
    public void run(){}
   public void fly(){}
}                                                  
}