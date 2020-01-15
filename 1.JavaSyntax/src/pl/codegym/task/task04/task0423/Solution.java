package pl.codegym.task.task04.task0423;

/* 
Strategia ochroniarzy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj swój wiek: ");
        String imie=reader.readLine();
        int wiek = Integer.parseInt(reader.readLine());

        if(wiek>18){
            System.out.println("Wystarczy, że masz 18");
        }


    }
}
