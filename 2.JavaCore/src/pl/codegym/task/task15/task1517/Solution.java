package pl.codegym.task.task15.task1517;

/* 
Modyfikatory statyczne i wyjątki
*/

public class Solution {
    public static int A = 0;

    static {
        if(true)
        throw new NullPointerException();
      // Throw an exception here
    }

    public static int B = 5;

    public static void main(String[] args) throws Exception{
        System.out.println(B);
    }
}
