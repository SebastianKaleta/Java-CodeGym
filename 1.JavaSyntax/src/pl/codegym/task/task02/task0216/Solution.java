package pl.codegym.task.task02.task0216;

/* 
Najmniejsza z trzech liczb
*/
public class Solution {
    public static int min(int a, int b, int c) {
        //tutaj wpisz swój kod
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        }else {
            return a;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}