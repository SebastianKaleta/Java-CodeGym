package pl.codegym.task.task16.task1603;                                                                                                                                                      
                                                                                                                                                      
import java.util.ArrayList;                                                                                                                                                      
import java.util.List;                                                                                                                                                      
                                                                                                                                                      
/*                                                                                                                                                       
Lista i kilka wątków                                                                                                                                                      
*/                                                                                                                                                      
                                                                                                                                                      
public class Solution {                                                                                                                                                      
    public static volatile List<Thread> list = new ArrayList<>(5);                                                                                                                                                      
                                                                                                                                                      
    public static void main(String[] args) {                                                                                                                                                      
        //tutaj wpisz swój kod                                                                                                     
                                                                                                    
                                                                                                    
                                                                                                    
 SpecialThread sp=new SpecialThread();                                                                                                   
 Thread threadChild= new Thread(sp);
SpecialThread sp1=new SpecialThread();                                                                                                   
 Thread threadChild1= new Thread(sp1);
SpecialThread sp2=new SpecialThread();                                                                                                   
 Thread threadChild2= new Thread(sp2);
SpecialThread sp3=new SpecialThread();                                                                                                   
 Thread threadChild3= new Thread(sp3);
SpecialThread sp4=new SpecialThread();                                                                                                   
 Thread threadChild4= new Thread(sp4);

list.add(threadChild);
list.add(threadChild1);
list.add(threadChild2);
list.add(threadChild3);
  list.add(threadChild4);                                                                                                 
                                                                                                    
                                                                                                   
                                                                                                                                               
    }                                                                                                                                                      
                                                                                                                                                      
    public static class SpecialThread implements Runnable {                                                                                                                                                      
        public void run() {                                                                                                                                                      
            System.out.println("To jest metoda run wewnątrz SpecialThread");                                                                                                                                                      
        }                                                                                                                                                      
    }                                                                                                                                                      
}