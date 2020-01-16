package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int a,dodatnie=0, ujemne=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <3 ; i++) {
            a=Integer.parseInt(reader.readLine());
            if(a>0){
                dodatnie++;
            }else if(a<0){
                ujemne++;
            }
        }
        System.out.println("Liczba liczb ujemnych: "+ujemne);
        System.out.println("Liczba liczb dodatnich: "+dodatnie);

    }
}
