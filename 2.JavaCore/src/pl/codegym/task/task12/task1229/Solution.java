package pl.codegym.task.task12.task1229;                                                                                                    
                                                                                                    
/*                                                                                                     
Klasa macierzysta klasy CTO                                                                                                    
*/                                                                                                    
                                                                                                    
public class Solution {                                                                                                    
                                                                                                    
    public static void main(String[] args) {                                                                                                    
        CTO cto = new CTO();                                                                                                    
        System.out.println(cto);                                                                                                    
    }                                                                                                    
                                                                                                    
    public static interface Businessman {                                                                                                    
        public void workHard();                                                                                                    
    }                                                                                                    
    public static class Mother{                                                  
public void workHard(){}                                                 
}                                                                                                
    public static class CTO extends Mother implements Businessman {                                                                                                    
                                                                                                   
    }                                                                                                    
}