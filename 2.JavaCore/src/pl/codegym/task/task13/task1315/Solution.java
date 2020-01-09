package pl.codegym.task.task13.task1315;                                                  
                                                  
/*                                                   
Tom, Jerry i Spike                                                  
*/                                                  
                                                  
public class Solution {                                                  
                                                  
    public static void main(String[] args) {                                                  
                                                  
    }                                                  
                                                  
    // Potrafi się poruszać                                                  
    public interface CanMove {                                                  
        void move();                                                  
    }                                                  
                                                  
    // Może zostać zjedzony                                                  
    public interface Edible {                                                  
        void beEaten();                                                  
    }                                                  
                                                  
    // Potrafi jeść                                                  
    public interface CanEat {                                                  
        void eat();                                                  
    }
public static class Cat implements CanMove,Edible,CanEat{
 public void move(){};
 public void eat(){};
 public void beEaten(){};
}

public static class Mouse implements CanMove,Edible{
public void move(){};
 
 public void beEaten(){};
}
public static class Dog implements CanMove,CanEat{
public void move(){};
 public void eat(){};
 
}                                                  
}