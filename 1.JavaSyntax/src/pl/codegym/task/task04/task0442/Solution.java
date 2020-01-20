package pl.codegym.task.task04.task0442;


/* 
Dodawanie
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int wynik = 0;
        while (true) {
            int liczba = Integer.parseInt(reader.readLine());
            if (liczba == -1){
                System.out.println(wynik);
                break;
            }
            else {
                wynik=wynik+liczba;
            }
        }



    }
}
