package pl.codegym.task.task16.task1619;                                                  
                                                  
/*                                                   
Bez przerywania, nic z tego?                                                  
*/                                                  
                                                  
public class Solution { 
     public static boolean finish=true;                                            
    public static void main(String[] args) throws InterruptedException {                                                  
        Thread t = new Thread(new TestThread());                                                  
        t.start();                                                  
        Thread.sleep(3000);                                                  
        ourInterrupt();                                                  
    }                                                  
                                                  
    public static void ourInterrupt(){                                                  
       finish=false;                                           
    }                                                  
                                                  
    public static class TestThread implements Runnable {                                                  

        public void run() {                                                  
            while (finish) {                                                  
                try {                                                  
                    System.out.println("he, he");                                                  
                    Thread.sleep(500);                                                  
                } catch (InterruptedException e) {                                                  
                }                                                  
            }                                                  
        }                                                  
    }                                                  
}