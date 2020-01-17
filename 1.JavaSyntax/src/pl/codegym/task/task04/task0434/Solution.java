package pl.codegym.task.task04.task0434;


/* 
Tabliczka mnożenia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int i=1;
        while (i<=10){

            for (int k = 1; k <= 10; k++) {
                System.out.print(i*k+" ");
            }
            System.out.println("");
            i++;
        }

    }
}
