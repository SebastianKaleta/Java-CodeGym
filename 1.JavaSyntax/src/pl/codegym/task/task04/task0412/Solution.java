package pl.codegym.task.task04.task0412;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());

        if(a>0){
            a=a*a;
            System.out.println(a);
        }else if(a<0){
            a++;
            System.out.println(a);
        }else{
            System.out.println(0);
        }

    }

}