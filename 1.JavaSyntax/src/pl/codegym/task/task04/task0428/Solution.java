package pl.codegym.task.task04.task0428;

/* 
Liczba dodatnia
*/

import java.io.*;

public class Solution {



    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int a,licznik=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <3 ; i++) {
            a=Integer.parseInt(reader.readLine());
            if(a>0){
               licznik++;
            }
        }
        System.out.println(licznik);
    }
}
