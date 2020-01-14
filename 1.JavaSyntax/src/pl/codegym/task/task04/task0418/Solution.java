package pl.codegym.task.task04.task0418;

/* 
Mniejsza z dwóch liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());

        if(a==b){
            System.out.println(a);
        }else if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }
}