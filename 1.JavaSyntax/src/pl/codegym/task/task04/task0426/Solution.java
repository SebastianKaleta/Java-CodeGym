package pl.codegym.task.task04.task0426;

/* 
Etykiety i liczby
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());

        if(a<0 && a%2==0){
            System.out.println("Ujemna liczba parzysta");
        }else if(a<0 && a%2!=0){
            System.out.println("Ujemna liczba nieparzysta");
        }if(a>0 && a%2==0){
            System.out.println("Dodatnia liczba parzysta");
        }else if(a>0 && a%2!=0){
            System.out.println("Dodatnia liczba nieparzysta");
        }else if(a==0){
            System.out.println("Zero");
        }

    }
}
