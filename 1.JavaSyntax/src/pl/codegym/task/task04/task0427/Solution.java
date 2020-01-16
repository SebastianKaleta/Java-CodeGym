package pl.codegym.task.task04.task0427;

/* 
Opisywanie liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());

        if(a%2==0 && a<10 ){
            System.out.println("Parzysta liczba jednocyfrowa");
        }else if(a%2!=0 && a<10  ){
            System.out.println("Niearzysta liczba jednocyfrowa");
        }else if( a%10==0 && a>10 && a<100 ){
            System.out.println("Parzysta liczba dwucyfrowa");
        }else if(a%10!=0 && a>10 && a<100){
            System.out.println("Nieparzysta liczba dwucyfrowa");
        }else if(a%100==0 && a>100 && a<1000){
            System.out.println("Parzysta liczba trzycyfrowa");
        }else if(a%100!=0 && a>100 && a<1000){
            System.out.println("Nieparzysta liczba trzycyfrowa");
        }

    }
}
