package pl.codegym.task.task04.task0432;



/* 
Dobrego nigdy zbyt wiele
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
        int n=Integer.parseInt(reader.readLine());
        int i=0;
        while(i<n) {
            i++;
            System.out.println(s);
        }


    }
}
