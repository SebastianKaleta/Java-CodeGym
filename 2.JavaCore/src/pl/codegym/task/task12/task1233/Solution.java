package pl.codegym.task.task12.task1233;                                                                                                    
                                                                                                    
/*                                                                                                     
Nadchodzą izomorfy                                                                                                    
*/                                                                                                    
                                                                                                    
public class Solution {                                                                                                    
                                                                                                    
    public static void main(String[] args) throws Exception {                                                                                                    
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};                                                                                                    
                                                                                                    
        Pair<Integer, Integer> result = getMinimumAndIndex(data);                                                                                                    
                                                                                                    
        System.out.println("Minimum to " + result.x);                                                                                                    
        System.out.println("Indeks najmniejszego elementu to " + result.y);                                                                                                    
    }                                                                                                    
                                                                                                    
    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {                                                                                                    
        if (array == null || array.length == 0) {                                                                                                    
            return new Pair<Integer, Integer>(null, null);                                                                                                    
        }      
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
int indeks=0;  
                                                                                              
              for (int i=0;i<array.length;i++) {
if(min>array[i]){
min=array[i];
indeks=i;
}else if(max<array[i]){
max=array[i];
}


}                                                                                         
        //tutaj wpisz swój kod                                                                                                    
                                                                                                    
        return new Pair<Integer, Integer>(min, indeks);                                                                                                    
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