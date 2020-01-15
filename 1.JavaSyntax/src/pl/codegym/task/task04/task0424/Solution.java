package pl.codegym.task.task04.task0424;

/* 
Trzy liczby
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int[] liczby=new int[3];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            liczby[i]=Integer.parseInt(reader.readLine());
        }
        if(liczby[0]==liczby[1]&&liczby[0]!=liczby[2]){
            System.out.println(3);
        }else if(liczby[0]==liczby[2]&&liczby[0]!=liczby[1]){
            System.out.println(2);
        }else if(liczby[2]==liczby[1]&&liczby[0]!=liczby[2]&&liczby[0]!=liczby[1]){
            System.out.println(1);
        }



    }
}
