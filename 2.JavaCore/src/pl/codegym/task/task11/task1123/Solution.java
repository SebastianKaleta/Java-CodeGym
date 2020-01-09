package pl.codegym.task.task11.task1123;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};                                                  
                                                  
        Pair<Integer, Integer> result = getMinimumAndMaximum(data);                                                  
                                                  
        System.out.println("Minimum to " + result.x);                                                  
        System.out.println("Maximum to " + result.y);                                                  
    }                                                  
                                                  
    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {                                                  
        if (array == null || array.length == 0) {                                                  
            return new Pair<Integer, Integer>(null, null);                                                  
        } 
        int a=Integer.MIN_VALUE,b=Integer.MAX_VALUE;
        
         for (int i=0;i<array.length;i++)
            {
            if(array[i]>a){
                a=array[i];
            }else if(array[i]<a&&array[i]<b){
              b=array[i];
            }
        }                                                
                                                  
        //tutaj wpisz swój kod                                                  
                                                  
        return new Pair<Integer, Integer>(b, a);                                                  
    }                                                  
                                                  
                                                  
    public static class Pair<X, Y> {                                                  
        public X x;                                                  
        public Y y;                                                  
                                                  
        public Pair(X x, Y y) {                                                  
            this.x = x;                                                  
            this.y = y;                                                  
        }                                                  
    }                                                  
}