package pl.codegym.task.task03.task0319;

/* 
Prognozy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(s+" dostanie "+a+" za "+b+" lat.");
    }
}
